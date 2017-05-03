package com.king.tv.mvp.presenter;

import com.king.base.util.LogUtils;
import com.king.base.util.StringUtils;
import com.king.tv.App;
import com.king.tv.bean.LiveInfo;
import com.king.tv.bean.LiveListResult;
import com.king.tv.mvp.base.BasePresenter;
import com.king.tv.mvp.view.ILiveListView;

import java.util.List;

import javax.inject.Inject;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/2/21
 */

public class LiveListPresenter extends BasePresenter<ILiveListView> {

    @Inject
    public LiveListPresenter(App app) {
        super(app);
    }


    public void getLiveList(String slug){
        if(StringUtils.isBlank(slug)){
            getLiveList();
        }else{
            getLiveListBySlug(slug);
        }
    }


    public void getLiveList(){
        if(isViewAttached()){
            getView().showProgress();
        }
        getAppComponent().getAPIService()
                .getLiveListResult()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LiveListResult>() {
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
                    public void onNext(LiveListResult liveListResult) {
                        LogUtils.d("Response:" + liveListResult);
                        List<LiveInfo> list = null;
                        if(liveListResult!=null){
                            list = liveListResult.getData();
                        }
                        if(isViewAttached())
                            getView().onGetLiveList(list);

                    }
                });
    }


    public void getLiveListBySlug(String slug){
        if(isViewAttached()){
            getView().showProgress();
        }
        getAppComponent().getAPIService()
                .getLiveListResultByCategories(slug)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LiveListResult>() {
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
                    public void onNext(LiveListResult liveListResult) {
                        LogUtils.d("Response:" + liveListResult);
                        List<LiveInfo> list = null;
                        if(liveListResult!=null){
                            list = liveListResult.getData();
                        }
                        if(isViewAttached())
                            getView().onGetLiveList(list);

                    }
                });
    }
}
