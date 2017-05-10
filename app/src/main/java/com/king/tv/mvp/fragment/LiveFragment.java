package com.king.tv.mvp.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.king.base.util.ToastUtils;
import com.king.tv.Constants;
import com.king.tv.R;
import com.king.tv.mvp.base.BaseFragment;
import com.king.tv.mvp.base.BasePresenter;
import com.king.tv.mvp.base.BaseView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/7
 */

public class LiveFragment extends BaseFragment<BaseView,BasePresenter<BaseView>> {

    @BindView(R.id.ivLeft)
    ImageView ivLeft;
    @BindView(R.id.ivRight)
    ImageView ivRight;
    @BindView(R.id.tvTitle)
    TextView tvTitle;


    private String title;
    private String slug;
    private boolean isTabLive;

    public static LiveFragment newInstance(String title,String slug, boolean isTabLive) {
        
        Bundle args = new Bundle();
        
        LiveFragment fragment = new LiveFragment();
        fragment.title = title;
        fragment.slug = slug;
        fragment.isTabLive = isTabLive;
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    public int getRootViewId() {
        return R.layout.fragment_live;
    }

    @Override
    public void initUI() {
        tvTitle.setText(title);
        if(isTabLive){
            ivLeft.setImageResource(R.drawable.ic_top_search);
            ivRight.setVisibility(View.VISIBLE);
        }else{
            ivLeft.setImageResource(R.drawable.btn_back_selector);
            ivRight.setVisibility(View.INVISIBLE);
        }
        replaceChildFragment(R.id.fragment,LiveListFragment.newInstance(slug));
    }

    @Override
    public void initData() {

    }

    private void clickLeft(){
        if(isTabLive){
            startActivity(getFragmentIntent(Constants.SEARCH_FRAGMENT));
        }else{
            finish();
        }
    }

    @OnClick({R.id.ivLeft,R.id.ivRight})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.ivLeft:
                clickLeft();
                break;
            case R.id.ivRight:
                startLogin();
                break;
        }
    }


    @Override
    public BasePresenter<BaseView> createPresenter() {
        return new BasePresenter<BaseView>(getApp());
    }
}
