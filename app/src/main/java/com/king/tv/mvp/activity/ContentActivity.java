package com.king.tv.mvp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.king.base.util.LogUtils;
import com.king.tv.Constants;
import com.king.tv.R;
import com.king.tv.mvp.fragment.AboutFragment;
import com.king.tv.mvp.fragment.FullRoomFragment;
import com.king.tv.mvp.fragment.LiveFragment;
import com.king.tv.mvp.fragment.LoginFragment;
import com.king.tv.mvp.fragment.RoomFragment;
import com.king.tv.mvp.fragment.SearchFragment;
import com.king.tv.mvp.fragment.WebFragment;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/2/20
 */

public class ContentActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);

        swichFragment(getIntent());
    }

    public void swichFragment(Intent intent){

        int fragmentKey = intent.getIntExtra(Constants.KEY_FRAGMENT,0);
        switch (fragmentKey){
            case Constants.ROOM_FRAGMENT:
                replaceFragment(RoomFragment.newInstance(intent.getStringExtra(Constants.KEY_UID)));
                break;
            case Constants.LIVE_FRAGMENT: {
                String title = intent.getStringExtra(Constants.KEY_TITLE);
                String slug = intent.getStringExtra(Constants.KEY_SLUG);
                boolean isTabLive = intent.getBooleanExtra(Constants.KEY_IS_TAB_LIVE, false);
                replaceFragment(LiveFragment.newInstance(title, slug, isTabLive));
                break;
            }case Constants.WEB_FRAGMENT: {
                String title = intent.getStringExtra(Constants.KEY_TITLE);
                String url = intent.getStringExtra(Constants.KEY_URL);
                replaceFragment(WebFragment.newInstance(url, title));
                break;
            }case Constants.LOGIN_FRAGMENT:
                replaceFragment(LoginFragment.newInstance());
                break;
            case Constants.ABOUT_FRAGMENT:
                replaceFragment(AboutFragment.newInstance());
                break;
            case Constants.FULL_ROOM_FRAGMENT:
                String uid = intent.getStringExtra(Constants.KEY_UID);
                String cover = intent.getStringExtra(Constants.KEY_COVER);
                replaceFragment(FullRoomFragment.newInstance(uid,cover));
                break;
            case Constants.SEARCH_FRAGMENT:
                replaceFragment(SearchFragment.newInstance());
                break;
            default:
                LogUtils.d("Not found fragment:" + Integer.toHexString(fragmentKey));
                break;
        }
    }


    public void replaceFragment(Fragment fragmnet){
        replaceFragment(R.id.fragmentContent,fragmnet);
    }

    public void replaceFragment(@IdRes int id, Fragment fragment) {

        getSupportFragmentManager().beginTransaction().replace(id, fragment).commit();
    }

}
