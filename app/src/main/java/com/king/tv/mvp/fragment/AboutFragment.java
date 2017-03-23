package com.king.tv.mvp.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.king.base.util.SystemUtils;
import com.king.tv.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/21
 */

public class AboutFragment extends SimpleFragment {

    @BindView(R.id.ivLeft)
    ImageView ivLeft;
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.tvVersion)
    TextView tvVersion;
    @BindView(R.id.tvAuthor)
    TextView tvAuthor;
    @BindView(R.id.tvEmail)
    TextView tvEmail;
    @BindView(R.id.tvCSDN)
    TextView tvCSDN;
    @BindView(R.id.tvGithub)
    TextView tvGithub;

    public static AboutFragment newInstance() {

        Bundle args = new Bundle();

        AboutFragment fragment = new AboutFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_about;
    }

    @Override
    public void initUI() {
        tvTitle.setText(R.string.about);

        tvVersion.setText(String.format(getString(R.string.current_version_), SystemUtils.getVersionName(context)));
    }

    @Override
    public void initData() {

    }

    private void clickEmail(){
        Uri uri = Uri.parse("mailto:jenly1314@gmail.com");
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        startActivity(Intent.createChooser(intent, "Choose Email Client"));
    }

    @OnClick({R.id.ivLeft,R.id.tvEmail,R.id.tvCSDN, R.id.tvGithub})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivLeft:
                finish();
                break;
            case R.id.tvEmail:
                clickEmail();
                break;
            case R.id.tvCSDN:
                startWeb("Jenly",tvCSDN.getText().toString());
                break;
            case R.id.tvGithub:
                startWeb("Jenly",tvGithub.getText().toString());
                break;
        }
    }
}
