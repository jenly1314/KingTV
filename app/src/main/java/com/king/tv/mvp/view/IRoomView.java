package com.king.tv.mvp.view;

import com.king.tv.bean.Room;
import com.king.tv.mvp.base.BaseView;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/7
 */

public interface IRoomView extends BaseView {



    void enterRoom(Room room);

    void playUrl(String url);

}
