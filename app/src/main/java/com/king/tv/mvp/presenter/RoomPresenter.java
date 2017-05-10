package com.king.tv.mvp.presenter;

import com.king.base.util.LogUtils;
import com.king.tv.App;
import com.king.tv.bean.Room;
import com.king.tv.bean.RoomLine;
import com.king.tv.mvp.base.BasePresenter;
import com.king.tv.mvp.view.IRoomView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/7
 */

public class RoomPresenter extends BasePresenter<IRoomView> {

    public RoomPresenter(App app) {
        super(app);
    }

    public void enterRoom(String uid){
        enterRoom(uid,false);
    }

    public void enterRoom(String uid,final boolean isShowing){
        if(isViewAttached())
            getView().showProgress();
        getAppComponent().getAPIService()
                .enterRoom(uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Room>() {
                    @Override
                    public void onCompleted() {
                        if(isViewAttached())
                            getView().onCompleted();
                    }

                    @Override
                    public void onError(Throwable e) {
                        if(isViewAttached())
                            getView().onError(e);
                    }

                    @Override
                    public void onNext(Room room) {
                        LogUtils.d("Response:" + room);
                        if(isViewAttached())
                            getView().enterRoom(room);

                        if(room!= null){
                            String url =null;
//                            RoomLine roomLine = room.getRoom_lines().get(0);
                            RoomLine roomLine = room.getLive().getWs();

                            RoomLine.FlvBean flv = roomLine.getFlv();
                            LogUtils.d("flv:" + flv);
                            if(flv!=null){
                                url = flv.getValue(isShowing).getSrc();
                            }else{
                                url = roomLine.getHls().getValue(isShowing).getSrc();
                            }
                            if(isViewAttached())
                                getView().playUrl(url);
                        }

                    }
                });


    }



}
