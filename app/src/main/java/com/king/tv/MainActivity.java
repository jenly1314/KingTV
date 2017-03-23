package com.king.tv;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import com.king.base.util.LogUtils;
import com.king.base.util.ToastUtils;
import com.king.tv.mvp.base.PureActivity;
import com.king.tv.mvp.fragment.FollowFragment;
import com.king.tv.mvp.fragment.HomeFragment;
import com.king.tv.mvp.fragment.LiveFragment;
import com.king.tv.mvp.fragment.MineFragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;

public class MainActivity extends PureActivity {

    @BindView(com.king.tv.R.id.rbHome)
    RadioButton rbHome;
    @BindView(com.king.tv.R.id.rbLive)
    RadioButton rbLive;
    @BindView(com.king.tv.R.id.rbFollw)
    RadioButton rbFollw;
    @BindView(com.king.tv.R.id.rbMe)
    RadioButton rbMe;

    private HomeFragment homeFragment;

    private LiveFragment liveFragment;

    private FollowFragment followFragment;

    private MineFragment mineFragment;

    private boolean isExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        isExit = false;
    }

    @Override
    public int getRootViewId() {
        return com.king.tv.R.layout.activity_main;
    }

    @Override
    public void initUI() {
        showHomeFragment();
    }


    @Override
    public void onBackPressed() {

        if(!isExit){
            ToastUtils.showToast(context,R.string.press_again_to_exit);
            isExit = true;
            EventBus.getDefault().post(isExit);
        }else{
            super.onBackPressed();
        }

    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void onEventExit(Boolean isBool){
        SystemClock.sleep(1000);
        isExit = false;
    }


    public void showHomeFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        hideAllFragment(fragmentTransaction);
        if(homeFragment == null){
            homeFragment = HomeFragment.newInstance();
            fragmentTransaction.add(com.king.tv.R.id.fragmentContent,homeFragment);
        }
        commitShowFragment(fragmentTransaction,homeFragment);
    }

    public void showLiveFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        hideAllFragment(fragmentTransaction);
        if(liveFragment == null){
            liveFragment = LiveFragment.newInstance(getString(R.string.tab_live),null,true);
            fragmentTransaction.add(com.king.tv.R.id.fragmentContent,liveFragment);
        }

        commitShowFragment(fragmentTransaction,liveFragment);

    }

    public void showFollowFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        hideAllFragment(fragmentTransaction);
        if(followFragment == null){
            followFragment = FollowFragment.newInstance();
            fragmentTransaction.add(com.king.tv.R.id.fragmentContent,followFragment);
        }

        commitShowFragment(fragmentTransaction,followFragment);

    }

    public void showMineFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        hideAllFragment(fragmentTransaction);
        if(mineFragment == null){
            mineFragment = MineFragment.newInstance();
            fragmentTransaction.add(com.king.tv.R.id.fragmentContent,mineFragment);
        }

        commitShowFragment(fragmentTransaction,mineFragment);

    }

    public void commitShowFragment(FragmentTransaction fragmentTransaction,Fragment fragment){
        fragmentTransaction.show(fragment);
        fragmentTransaction.commit();
    }

    public void hideAllFragment(FragmentTransaction fragmentTransaction){
        hideFragment(fragmentTransaction,homeFragment);
        hideFragment(fragmentTransaction,liveFragment);
        hideFragment(fragmentTransaction,followFragment);
        hideFragment(fragmentTransaction,mineFragment);
    }

    private void hideFragment(FragmentTransaction fragmentTransaction,Fragment fragment){
        if(fragment!=null){
            fragmentTransaction.hide(fragment);
        }
    }

    public void replaceFragment(@IdRes int id, Fragment fragment) {

        getSupportFragmentManager().beginTransaction().replace(id, fragment).commit();
    }

    @OnClick({com.king.tv.R.id.rbHome, com.king.tv.R.id.rbLive, com.king.tv.R.id.rbFollw, com.king.tv.R.id.rbMe})
    public void onClick(View view) {
        switch (view.getId()) {
            case com.king.tv.R.id.rbHome:
                showHomeFragment();
                break;
            case com.king.tv.R.id.rbLive:
                showLiveFragment();
                break;
            case com.king.tv.R.id.rbFollw:
                showFollowFragment();
                break;
            case com.king.tv.R.id.rbMe:
                showMineFragment();
                break;
        }
    }
}
