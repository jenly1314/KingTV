package com.king.tv.mvp.presenter;

import com.king.base.util.LogUtils;
import com.king.base.util.StringUtils;
import com.king.tv.App;
import com.king.tv.bean.LiveInfo;
import com.king.tv.bean.LiveListResult;
import com.king.tv.bean.P;
import com.king.tv.bean.SearchRequestBody;
import com.king.tv.bean.SearchResult;
import com.king.tv.mvp.base.BasePresenter;
import com.king.tv.mvp.view.ILiveListView;

import java.util.List;

import javax.inject.Inject;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
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

    public void getLiveListByKey(String key,int page){
        getLiveListByKey(key,page,P.DEFAULT_SIZE);
    }

    public void getLiveListByKey(String key, final int page, int pageSize){
        if(isViewAttached()){
            getView().showProgress();
        }
        getAppComponent().getAPIService()
                .search(SearchRequestBody.getInstance(new P(page,key,pageSize)))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<SearchResult, List<LiveInfo>>() {

                    @Override
                    public List<LiveInfo> call(SearchResult searchResult) {
                        LogUtils.d("Response:" + searchResult);
                        if(searchResult!=null){
                            if(searchResult.getData()!=null){
                                return searchResult.getData().getItems();
                            }else{
                                LogUtils.d(searchResult.toString());
                            }

                        }
                       return null;
                    }
                })
                .onErrorReturn(new Func1<Throwable, List<LiveInfo>>() {
                    @Override
                    public List<LiveInfo> call(Throwable throwable) {
                        LogUtils.w(throwable);
                        return null;
                    }
                })
                .subscribe(new Action1<List<LiveInfo>>() {
                    @Override
                    public void call(List<LiveInfo> list) {
                        if(isViewAttached()){
                            if(page>0){
                                getView().onGetMoreLiveList(list);
                            }else{
                                getView().onGetLiveList(list);
                            }

                        }

                    }
                });

    }
}
