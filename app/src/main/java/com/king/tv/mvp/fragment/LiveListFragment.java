package com.king.tv.mvp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.widget.TextView;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.king.base.util.LogUtils;
import com.king.base.util.SystemUtils;
import com.king.tv.Constants;
import com.king.tv.R;
import com.king.tv.bean.LiveCategory;
import com.king.tv.bean.LiveInfo;
import com.king.tv.mvp.adapter.EasyLiveAdapter;
import com.king.tv.mvp.base.BaseFragment;
import com.king.tv.mvp.presenter.LiveListPresenter;
import com.king.tv.mvp.view.ILiveListView;
import com.king.tv.util.DensityUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/2/21
 */

public class LiveListFragment extends BaseFragment<ILiveListView, LiveListPresenter> implements ILiveListView {


    TextView tvTips;

    @BindView(R.id.easyRecyclerView)
    EasyRecyclerView easyRecyclerView;

    EasyLiveAdapter easyLiveAdapter;

    List<LiveInfo> listData;

    private String slug;

    public static LiveListFragment newInstance(String slug) {
        Bundle args = new Bundle();

        LiveListFragment fragment = new LiveListFragment();
        fragment.slug = slug;
        fragment.setArguments(args);

        return fragment;
    }


    @Override
    public int getRootViewId() {
        return R.layout.fragment_live_list;
    }

    @Override
    public void initUI() {
        tvTips = (TextView) easyRecyclerView.findViewById(R.id.tvTips);

        SpaceDecoration spaceDecoration = new SpaceDecoration(DensityUtil.dp2px(context,6));
        easyRecyclerView.addItemDecoration(spaceDecoration);
//        recyclerView.setRefreshingColor(R.color.colorPrimary);
        easyRecyclerView.setRefreshingColorResources(R.color.progress_color);
        listData = new ArrayList<>();
        easyLiveAdapter = new EasyLiveAdapter(context,listData);
        easyLiveAdapter.setNotifyOnChange(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context,2);
        gridLayoutManager.setSpanSizeLookup(easyLiveAdapter.obtainGridSpanSizeLookUp(2));
        easyRecyclerView.setLayoutManager(gridLayoutManager);

        easyRecyclerView.setAdapter(easyLiveAdapter);

        easyRecyclerView.setRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getPresenter().getLiveList(slug);
            }
        });

        easyLiveAdapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                startRoom(easyLiveAdapter.getItem(position));
            }
        });
    }

    @Override
    public void initData() {
        easyRecyclerView.showProgress();
        getPresenter().getLiveList(slug);
    }


    @Override
    public LiveListPresenter createPresenter() {
        return new LiveListPresenter(getApp());
    }

    public void refreshView(){
        easyLiveAdapter.notifyDataSetChanged();
        easyRecyclerView.setRefreshing(false);
    }

    @Override
    public void onGetLiveList(List<LiveInfo> list) {
//        toSetList(listData,list,false);
        easyLiveAdapter.clear();
        easyLiveAdapter.addAll(list);
        refreshView();
        if(easyLiveAdapter.getCount()==0){
            easyRecyclerView.showEmpty();
        }
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void onCompleted() {
        easyRecyclerView.setRefreshing(false);
    }

    @Override
    public void onError(Throwable e) {
        LogUtils.w(e);
        if(SystemUtils.isNetWorkActive(context)){
            tvTips.setText(R.string.page_load_failed);
        }else{
            tvTips.setText(R.string.network_unavailable);
        }
        easyRecyclerView.showError();
    }

}
