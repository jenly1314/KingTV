package com.king.tv.mvp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.king.base.util.StringUtils;
import com.king.base.util.ToastUtils;
import com.king.tv.R;
import com.king.tv.mvp.base.BaseFragment;
import com.king.tv.mvp.base.BasePresenter;
import com.king.tv.mvp.base.BaseView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/5/9
 */

public class SearchFragment extends BaseFragment<BaseView, BasePresenter<BaseView>> {


    @BindView(R.id.ivLeft)
    ImageView ivLeft;
    @BindView(R.id.etKey)
    EditText etKey;
    @BindView(R.id.tvRight)
    TextView tvRight;

    private LiveListFragment liveListFragment;


    public static SearchFragment newInstance() {
        
        Bundle args = new Bundle();
        
        SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public int getRootViewId() {
        return R.layout.fragment_search;
    }

    @Override
    public void initUI() {

        etKey.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(event.getAction() == KeyEvent.ACTION_UP){
                    if(keyCode == KeyEvent.KEYCODE_ENTER || keyCode == KeyEvent.KEYCODE_SEARCH){
                        clickSearch();
                        return true;
                    }
                }

                return false;
            }
        });
    }

    @Override
    public void initData() {
        liveListFragment = LiveListFragment.newInstance(null,true);
        replaceChildFragment(R.id.fragment,liveListFragment);
    }

    @Override
    public BasePresenter createPresenter() {
        return new BasePresenter(getApp());
    }



    /**
     * 隐藏软键盘
     *
     * @param v
     */
    public void hideInputMethod(final EditText v) {

        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(),0);
        v.clearFocus();
    }

    /**
     * 显示软键盘
     *
     * @param v
     */
    public void showInputMethod(final EditText v) {

        v.requestFocus();
        InputMethodManager imm = (InputMethodManager)context
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(v,InputMethodManager.SHOW_IMPLICIT);
    }

    private boolean checkInputKey(){
        if(StringUtils.isBlank(etKey.getText())){
            ToastUtils.showToast(context,R.string.tips_search_keywords_cannot_be_empty);
            return false;
        }
        return true;
    }

    private void clickSearch(){
        if(checkInputKey()){
            hideInputMethod(etKey);
            liveListFragment.search(etKey.getText().toString(),0);

        }


    }


    @OnClick({R.id.ivLeft, R.id.tvRight})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivLeft:
                finish();
                break;
            case R.id.tvRight:
                clickSearch();
                break;
        }
    }
}
