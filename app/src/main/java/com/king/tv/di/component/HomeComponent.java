package com.king.tv.di.component;

import com.king.tv.di.scope.FragmentScope;
import com.king.tv.di.module.CateroyModule;
import com.king.tv.di.module.LiveListModule;
import com.king.tv.mvp.fragment.HomeFragment;
import com.king.tv.mvp.fragment.LiveListFragment;
import com.king.tv.mvp.presenter.CategoryPresenter;
import com.king.tv.mvp.presenter.LiveListPresenter;

import dagger.Component;


/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/2
 */
@FragmentScope
@Component(modules = {CateroyModule.class,LiveListModule.class},dependencies = AppComponent.class)
public interface HomeComponent {

    void inject(HomeFragment homeFragment);
    void inject(LiveListFragment liveListFragment);

    CategoryPresenter getCateroyPresenter();

    LiveListPresenter getLiveListPresenter();

}
