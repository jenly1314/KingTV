package com.king.tv.di.module;

import com.king.tv.App;
import com.king.tv.di.scope.FragmentScope;
import com.king.tv.mvp.presenter.CategoryPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/2
 */

@Module
public class CateroyModule {

    private App app;

    public CateroyModule(App app){
        this.app = app;
    }


    @FragmentScope
    @Provides
    public CategoryPresenter provideCateroyPresenter(){
        return new CategoryPresenter(app);
    }


}
