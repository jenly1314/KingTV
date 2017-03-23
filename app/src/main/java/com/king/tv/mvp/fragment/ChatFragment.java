package com.king.tv.mvp.fragment;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.king.tv.R;
import com.king.tv.mvp.base.BaseFragment;
import com.king.tv.mvp.presenter.ChatPresenter;
import com.king.tv.mvp.view.IChatView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/9
 */

public class ChatFragment extends BaseFragment<IChatView, ChatPresenter> {


    @BindView(R.id.tvTips)
    TextView tvTips;
    @BindView(R.id.ivEmoji)
    ImageView ivEmoji;
    @BindView(R.id.etChat)
    EditText etChat;
    @BindView(R.id.ivDanmu)
    ImageView ivDanmu;
    @BindView(R.id.ivGif)
    ImageView ivGif;

    public static ChatFragment newInstance() {

        Bundle args = new Bundle();

        ChatFragment fragment = new ChatFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_chat;
    }

    @Override
    public void initUI() {


        SpannableStringBuilder ssb = new SpannableStringBuilder();
        //系统通知图片
        ImageSpan imageSpan = new ImageSpan(context,R.drawable.img_dm_xttz);
        SpannableString spannableString = new SpannableString("tips");
        spannableString.setSpan(imageSpan,0,spannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ssb.append(spannableString);
        //系统通知内容
        ssb.append(getText(R.string.tips_notice_desc));
        tvTips.setText(ssb);
    }

    @Override
    public void initData() {

    }

    @Override
    public ChatPresenter createPresenter() {
        return new ChatPresenter(getApp());
    }


    @OnClick({R.id.ivEmoji, R.id.ivDanmu, R.id.ivGif})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivEmoji:
                break;
            case R.id.ivDanmu:
                startLogin();
                break;
            case R.id.ivGif:
                break;
        }
    }
}
