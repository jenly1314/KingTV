package com.king.tv.mvp.presenter;

import com.king.base.util.LogUtils;
import com.king.tv.App;
import com.king.tv.bean.AppStart;
import com.king.tv.bean.Recommend;
import com.king.tv.mvp.base.BasePresenter;
import com.king.tv.mvp.view.IRecommendView;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/16
 */

public class RecommendPresenter extends BasePresenter<IRecommendView> {

    public RecommendPresenter(App app) {
        super(app);
    }



    public void getRecommend(){
        if(isViewAttached()){
            getView().showProgress();
        }
        getAppComponent().getAPIService()
                .getRecommend()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Recommend>() {
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
                    public void onNext(Recommend recommend) {
                        LogUtils.d("Response:"+ recommend);
                        if(isViewAttached())
                            getView().onGetRecommend(recommend);

                        if(recommend!=null){
                            if(isViewAttached())
                                getView().onGetRooms(recommend.getRoom());
                        }
                    }
                });
    }

    public void getBanner(){
        getAppComponent().getAPIService()
                .getAppStartInfo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<AppStart>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(AppStart appStart) {
                        if(appStart!=null){
                            if(isViewAttached())
                                getView().onGetBanner(appStart.getBanners());
                        }
                    }

                });
    }

}
