package com.king.tv.mvp.fragment;

import android.os.Bundle;
import android.support.annotation.MainThread;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.king.base.util.LogUtils;
import com.king.tv.R;
import com.king.tv.bean.Room;
import com.king.tv.util.DecimalFormatUtil;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/10
 */

public class AnchorInfoFragment extends SimpleFragment {

    @BindView(R.id.civAvatar)
    CircleImageView civAvatar;
    @BindView(R.id.tvAnchorName)
    TextView tvAnchorName;
    @BindView(R.id.tvAccount)
    TextView tvAccount;
    @BindView(R.id.tvFans)
    TextView tvFans;
    @BindView(R.id.tvWeight)
    TextView tvWeight;
    @BindView(R.id.tvStartLiveTime)
    TextView tvStartLiveTime;
    @BindView(R.id.tvAge)
    TextView tvAge;
    @BindView(R.id.tvEmotionalState)
    TextView tvEmotionalState;
    @BindView(R.id.tvLocation)
    TextView tvLocation;
    @BindView(R.id.tvOccupation)
    TextView tvOccupation;

    private Room room;

    public static AnchorInfoFragment newInstance(Room room) {
        Bundle args = new Bundle();

        AnchorInfoFragment fragment = new AnchorInfoFragment();
        fragment.room = room;
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_anchor;
    }

    @Override
    public void initUI() {

    }

    public void onUpdateAnchor(Room room){
        this.room = room;
        initData();
    }


    @Override
    public void initData() {

        if (room != null && getRootView()!=null) {
            Glide.with(this).load(room.getAvatar()).error(R.drawable.mine_default_avatar).placeholder(R.drawable.mine_default_avatar).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(civAvatar);
            tvAnchorName.setText(room.getNick());
            tvAccount.setText(String.valueOf(room.getNo()));
            tvFans.setText(String.valueOf(room.getFollow()));
            tvWeight.setText(DecimalFormatUtil.formatW(room.getWeight()/100));
            tvStartLiveTime.setText(room.getAnnouncement());

        }
    }

}
