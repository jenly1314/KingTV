package com.king.tv.di.module;

import com.king.tv.App;
import com.king.tv.di.scope.FragmentScope;
import com.king.tv.mvp.presenter.LiveListPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/3
 */

@Module
public class LiveListModule {

    private App app;

    public LiveListModule(App app){
        this.app = app;
    }

    @FragmentScope
    @Provides
    public LiveListPresenter provideLiveListPresenter(){
        return new LiveListPresenter(app);
    }

}
