package com.king.tv.mvp.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;
import com.king.base.adapter.HolderRecyclerAdapter;
import com.king.tv.Constants;
import com.king.tv.R;
import com.king.tv.bean.LiveInfo;
import com.king.tv.bean.Recommend;
import com.king.tv.mvp.activity.ContentActivity;
import com.king.tv.util.DensityUtil;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/17
 */

public class RecommendAdapter extends RecyclerArrayAdapter<Recommend.RoomBean> {



    public RecommendAdapter(Context context, List<Recommend.RoomBean> objects) {
        super(context, objects);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecommendViewHolder(parent);
    }

    public class RecommendViewHolder extends BaseViewHolder<Recommend.RoomBean>{


        ImageView iv;
        TextView tvCategroy;
        TextView tvMore;
        EasyRecyclerView recyclerView;

        RecommendChildAdapter adapter;

        public RecommendViewHolder(ViewGroup parent) {
            super(parent, R.layout.list_remmend_item);

            iv = $(R.id.iv);
            tvCategroy = $(R.id.tvCategroy);
            tvMore = $(R.id.tvMore);
            recyclerView = $(R.id.recyclerView);
            SpaceDecoration spaceDecoration = new SpaceDecoration(DensityUtil.dp2px(getContext(),6));
            recyclerView.addItemDecoration(spaceDecoration);

            adapter = new RecommendChildAdapter(getContext(),null);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
//            gridLayoutManager.setSpanSizeLookup(recommendAdapter.obtainGridSpanSizeLookUp(2));
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setAdapter(adapter);
            adapter.setOnItemClicklistener(new HolderRecyclerAdapter.OnItemClicklistener() {
                @Override
                public void onItemClick(View v, int position) {
                    //-1去掉头部位置
                    Recommend.RoomBean.ListBean listBean = getAllData().get(getAdapterPosition()-1).getList().get(position);
                    startRoom(getContext(),listBean);
                }
            });

        }

        public void startLive(Context context,String title,String slug){
            Intent intent = new Intent(context, ContentActivity.class);
            intent.putExtra(Constants.KEY_FRAGMENT,Constants.LIVE_FRAGMENT);
            intent.putExtra(Constants.KEY_TITLE,title);
            intent.putExtra(Constants.KEY_SLUG,slug);
            context.startActivity(intent);
        }

        public void startRoom(Context context,Recommend.RoomBean.ListBean listBean){
            Intent intent = new Intent(context, ContentActivity.class);
            int fragmentKey = Constants.ROOM_FRAGMENT;
            if(Constants.SHOWING.equalsIgnoreCase(listBean.getCategory_slug())){
                fragmentKey = Constants.FULL_ROOM_FRAGMENT;
            }
            intent.putExtra(Constants.KEY_FRAGMENT,fragmentKey);
            intent.putExtra(Constants.KEY_UID,String.valueOf(listBean.getUid()));
            intent.putExtra(Constants.KEY_COVER,listBean.getThumb());
            context.startActivity(intent);
        }

        @Override
        public void setData(final Recommend.RoomBean data) {
            super.setData(data);
            Glide.with(getContext()).load(data.getIcon()).error(R.drawable.default_recommend_icon).crossFade().centerCrop().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(iv);
            tvCategroy.setText(data.getName());
            tvMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startLive(getContext(),data.getName(),data.getSlug());
                }
            });

            adapter.setListData(data.getList());
            adapter.notifyDataSetChanged();


        }
    }
}
