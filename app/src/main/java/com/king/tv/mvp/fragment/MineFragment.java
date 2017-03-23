package com.king.tv.mvp.fragment;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.king.tv.R;

import butterknife.BindView;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/9
 */

public class MineFragment extends SimpleFragment {


    @BindView(R.id.ivLeft)
    ImageView ivLeft;
    @BindView(R.id.ivRight)
    ImageView ivRight;
    @BindView(R.id.ivAvatar)
    ImageView ivAvatar;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.tvFollow)
    TextView tvFollow;
    @BindView(R.id.tvFans)
    TextView tvFans;
    @BindView(R.id.tvNiuBi)
    TextView tvNiuBi;
    @BindView(R.id.tvSeed)
    TextView tvSeed;
    @BindView(R.id.tvRecharge)
    TextView tvRecharge;
    @BindView(R.id.tvStarLight)
    TextView tvStarLight;
    @BindView(R.id.tvContribution)
    TextView tvContribution;
    @BindView(R.id.tvWatch)
    TextView tvWatch;
    @BindView(R.id.tvLevel)
    TextView tvLevel;
    @BindView(R.id.tvTask)
    TextView tvTask;
    @BindView(R.id.tvGame)
    TextView tvGame;
    @BindView(R.id.tvSetting)
    TextView tvSetting;
    @BindView(R.id.srl)
    SwipeRefreshLayout srl;
    @BindView(R.id.fab)
    View fab;


    public static MineFragment newInstance() {
        
        Bundle args = new Bundle();
        
        MineFragment fragment = new MineFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initUI() {

        srl.setColorSchemeColors(getResources().getColor(R.color.progress_color));

        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                updateRefreshStatus();
            }
        });
    }

    public void updateRefreshStatus(){
        Observable.create(new Observable.OnSubscribe<String>(){

            @Override
            public void call(Subscriber<? super String> subscriber) {
                SystemClock.sleep(1000);
                subscriber.onNext("refresh");
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        srl.setRefreshing(false);
                    }
                });
    }

    @Override
    public void initData() {

    }

    @OnClick({R.id.ivLeft, R.id.ivRight, R.id.ivAvatar, R.id.btnLogin, R.id.tvFollow, R.id.tvFans, R.id.tvRecharge, R.id.tvStarLight, R.id.tvContribution, R.id.tvWatch, R.id.tvLevel, R.id.tvTask, R.id.tvGame, R.id.tvSetting, R.id.fab})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivLeft:
                startLogin();
                break;
            case R.id.ivRight:
                startLogin();
                break;
            case R.id.ivAvatar:
                startLogin();
                break;
            case R.id.btnLogin:
                startLogin();
                break;
            case R.id.tvFollow:
                startLogin();
                break;
            case R.id.tvFans:
                startLogin();
                break;
            case R.id.tvRecharge:
                startLogin();
                break;
            case R.id.tvStarLight:
                break;
            case R.id.tvContribution:
                break;
            case R.id.tvWatch:
                break;
            case R.id.tvLevel:
                break;
            case R.id.tvTask:
                break;
            case R.id.tvGame:
                break;
            case R.id.tvSetting:
                break;
            case R.id.fab:
                startAbout();
                break;
        }
    }
}
