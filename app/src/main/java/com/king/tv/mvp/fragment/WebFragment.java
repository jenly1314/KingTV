package com.king.tv.mvp.fragment;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.king.base.util.LogUtils;
import com.king.base.util.StringUtils;
import com.king.base.util.SystemUtils;
import com.king.tv.Constants;
import com.king.tv.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/21
 */

public class WebFragment extends SimpleFragment {

    @BindView(R.id.ivLeft)
    ImageView ivLeft;
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.vError)
    LinearLayout vError;
    @BindView(R.id.webView)
    WebView webView;

    private String url;
    private String title;

    protected boolean isError;

    private boolean isShowError;

    public static WebFragment newInstance(String url,String title) {

        Bundle args = new Bundle();

        WebFragment fragment = new WebFragment();
        fragment.url = url;
        fragment.title = title;
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_webwiew;
    }

    @Override
    public void initUI() {

        if(!StringUtils.isBlank(title)){
            tvTitle.setText(title);
        }
        progressBar.setMax(100);

        isShowError = addErrorView(vError);

        WebSettings ws = webView.getSettings();
        //是否允许脚本支持
        ws.setJavaScriptEnabled(true);
        ws.setDomStorageEnabled(true);

        ws.setJavaScriptCanOpenWindowsAutomatically(true);

//        ws.setCacheMode(WebSettings.LOAD_NO_CACHE);

//        webView.setHorizontalScrollBarEnabled(false);

//        webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        String str = getIntent().getStringExtra(Constants.KEY_URL);
        if(!TextUtils.isEmpty(str)){
            this.url = str;
        }


        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                updateProgressBar(newProgress);
            }
        });
        webView.setWebViewClient(getWebViewClient());

        load(webView,url);
    }

    @Override
    public void initData() {

    }


    public WebViewClient getWebViewClient(){
        return new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                LogUtils.d("startUrl:" + url);
                isError = false;
                webView.setVisibility(View.VISIBLE);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                LogUtils.d("url:" + url);

                return super.shouldOverrideUrlLoading(view,url);

            }


            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                updateProgressBar(100);
            }


            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                LogUtils.w("errorCode:" + errorCode + "|failingUrl:" + failingUrl);
                showReceiveError();
            }


            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                super.onReceivedSslError(view, handler, error);
                handler.cancel();
                handler.proceed();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                hideReceiveError();
            }
        };
    }

    /**
     *
     * @param group
     * @return  true表示已添加ErrorView并显示ErrorView/false表示不处理
     */
    public boolean addErrorView(ViewGroup group){
        group.addView(LayoutInflater.from(context).inflate(R.layout.layout_error,null));
        return true;
    }

    private void showReceiveError(){
        isError = true;
        if(SystemUtils.isNetWorkActive(context)){
            LogUtils.w("Page loading failed.");
        }else{
            LogUtils.w("Network unavailable.");
        }

        if(isShowError){
            webView.setVisibility(View.GONE);
            vError.setVisibility(View.VISIBLE);

        }


    }

    private void hideReceiveError(){
        if(isError){
            showReceiveError();
        }else{
            webView.setVisibility(View.VISIBLE);
            vError.setVisibility(View.GONE);
        }

    }

    /**
     * 加载url
     * @param webView
     * @param url
     */
    private void load(WebView webView,String url){
        LogUtils.d("url:" + url);
        if(!TextUtils.isEmpty(url)){
            webView.loadUrl(url);
        }

    }

    private boolean isGoBack(){
        return webView!=null && webView.canGoBack();
    }


    private void updateProgressBar(int progress){
        updateProgressBar(true,progress);
    }


    private void updateProgressBar(boolean isVisibility,int progress){

        progressBar.setVisibility((isVisibility && progress<100) ? View.VISIBLE : View.GONE);
        progressBar.setProgress(progress);
    }


    @OnClick(R.id.ivLeft)
    public void onClick(View v){
        switch (v.getId()){
            case R.id.ivLeft:
                finish();
                break;
        }
    }
}
