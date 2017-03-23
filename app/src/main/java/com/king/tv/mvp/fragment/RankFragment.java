package com.king.tv.mvp.fragment;

import android.os.Bundle;

import com.king.tv.R;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/15
 */

public class RankFragment extends SimpleFragment {

    public static RankFragment newInstance() {

        Bundle args = new Bundle();

        RankFragment fragment = new RankFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_rank;
    }

    @Override
    public void initUI() {

    }

    @Override
    public void initData() {

    }
}
