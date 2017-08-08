package com.king.tv.mvp.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.king.base.util.LogUtils;
import com.king.base.util.SystemUtils;
import com.king.tv.Constants;
import com.king.tv.R;
import com.king.tv.bean.Banner;
import com.king.tv.bean.Recommend;
import com.king.tv.mvp.adapter.RecommendAdapter;
import com.king.tv.mvp.base.BaseFragment;
import com.king.tv.mvp.presenter.RecommendPresenter;
import com.king.tv.mvp.view.IRecommendView;
import com.king.tv.util.DensityUtil;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/17
 */

public class RecommendFragment extends BaseFragment<IRecommendView, RecommendPresenter> implements IRecommendView {


    private ConvenientBanner<Banner> convenientBanner;

    private TextView tvTips;

    @BindView(R.id.easyRecyclerView)
    EasyRecyclerView easyRecyclerView;

    RecommendAdapter recommendAdapter;

    private List<Recommend.RoomBean> listData;

    private List<Banner> listBanner;

    public static RecommendFragment newInstance() {

        Bundle args = new Bundle();

        RecommendFragment fragment = new RecommendFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_recommend;
    }

    @Override
    public void initUI() {

        tvTips = (TextView) easyRecyclerView.findViewById(R.id.tvTips);

        SpaceDecoration spaceDecoration = new SpaceDecoration(0);
        easyRecyclerView.addItemDecoration(spaceDecoration);
        easyRecyclerView.setRefreshingColorResources(R.color.progress_color);

        listData = new ArrayList<>();
        recommendAdapter = new RecommendAdapter(context,listData);


        listBanner = new ArrayList<>();
        recommendAdapter.addHeader(new HeaderView(listBanner));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false);
        easyRecyclerView.setLayoutManager(linearLayoutManager);

        easyRecyclerView.setAdapter(recommendAdapter);

        easyRecyclerView.setRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getPresenter().getRecommend();
            }
        });

    }

    private void clickBannerItem(Banner banner){
        if(banner!=null){
            if(banner.isRoom()){//如果是房间类型就点击进入房间
                startRoom(banner.getLink_object());
            }else{//广告类型
                startWeb(banner.getTitle(),banner.getLink());
            }
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        if(convenientBanner!=null && !convenientBanner.isTurning()) {
            convenientBanner.startTurning(4000);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if(convenientBanner!=null){
            convenientBanner.stopTurning();
        }

    }

    public class TestHeader implements RecyclerArrayAdapter.ItemView{

        @Override
        public View onCreateView(ViewGroup parent) {
            ImageView iv = new ImageView(context);
            iv.setImageResource(R.drawable.mine_default_avatar);
            return iv;
        }

        @Override
        public void onBindView(View headerView) {

        }
    }

    public class HeaderView implements RecyclerArrayAdapter.ItemView{

        private List<Banner> listBanner;

        public HeaderView(List<Banner> listBanner){
            this.listBanner = listBanner;
        }

        @Override
        public View onCreateView(ViewGroup parent) {
            View v = LayoutInflater.from(context).inflate(R.layout.banner,null);
            convenientBanner = (ConvenientBanner)v.findViewById(R.id.convenientBanner);
            convenientBanner.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    clickBannerItem(listBanner.get(position));
                }
            });
            return v;
        }

        @Override
        public void onBindView(View headerView) {
            convenientBanner.setPages(new CBViewHolderCreator() {
                @Override
                public Holder<Banner> createHolder() {
                    return new ImageHolder();
                }
            },listBanner)
                    .setPageIndicator(new int[]{R.drawable.ic_dot_normal,R.drawable.ic_dot_pressed})
                    .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL);

            if(!convenientBanner.isTurning()){
                convenientBanner.startTurning(4000);
            }
        }
    }

    public class ImageHolder implements Holder<Banner>{

        private ImageView iv;

        @Override
        public View createView(Context context) {
            iv = new ImageView(context);
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return iv;
        }

        @Override
        public void UpdateUI(Context context, int position, Banner data) {
            Glide.with(context).load(data.getThumb()).placeholder(R.mipmap.live_default).error(R.mipmap.live_default).centerCrop().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(iv);
        }
    }

    @Override
    public void initData() {
        easyRecyclerView.showProgress();
        getPresenter().getRecommend();
        getPresenter().getBanner();
    }

    @Override
    public RecommendPresenter createPresenter() {
        return new RecommendPresenter(getApp());
    }

    @Override
    public void onGetRecommend(Recommend recommend) {

    }

    @Override
    public void onGetRooms(List<Recommend.RoomBean> list) {
//        toSetList(listData,list,false);
        recommendAdapter.clear();
        recommendAdapter.addAll(list);
        recommendAdapter.notifyDataSetChanged();
        if(recommendAdapter.getCount()==0){
            easyRecyclerView.showEmpty();
        }
    }

    @Override
    public void onGetBanner(List<Banner> list) {

        if(convenientBanner!=null){
            toSetList(listBanner,list,false);
            convenientBanner.notifyDataSetChanged();
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
