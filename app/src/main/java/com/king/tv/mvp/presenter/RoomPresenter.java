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
        getView().showProgress();
        getAppComponent().getAPIService()
                .enterRoom(uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Room>() {
                    @Override
                    public void onCompleted() {
                        getView().onCompleted();
                    }

                    @Override
                    public void onError(Throwable e) {
                        getView().onError(e);
                    }

                    @Override
                    public void onNext(Room room) {
                        LogUtils.d("Response:" + room);
                        getView().enterRoom(room);
                        String url = null;
                        if(room!= null){
                            RoomLine roomLine = room.getLive().getWs();

                            RoomLine.FlvBean flv = roomLine.getFlv();
                            if(flv!=null){
                                url = flv.getValue3().getSrc();
                            }else{
                                url = roomLine.getHls().getValue3().getSrc();
                            }
                            getView().playUrl(url);
                        }

                    }
                });


    }



}
