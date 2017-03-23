package com.king.tv.mvp.view;

import com.king.tv.bean.Banner;
import com.king.tv.bean.Recommend;
import com.king.tv.mvp.base.BaseView;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/16
 */

public interface IRecommendView extends BaseView {

    void onGetRecommend(Recommend recommend);

    void onGetRooms(List<Recommend.RoomBean> list);

    void onGetBanner(List<Banner> list);
}
