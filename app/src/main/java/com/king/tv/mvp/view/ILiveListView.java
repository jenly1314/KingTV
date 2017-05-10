package com.king.tv.mvp.view;

import com.king.tv.bean.LiveInfo;
import com.king.tv.mvp.base.BaseView;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/2/21
 */

public interface ILiveListView extends BaseView {


    void onGetLiveList(List<LiveInfo> list);
    void onGetMoreLiveList(List<LiveInfo> list);

}
