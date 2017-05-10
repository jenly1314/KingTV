package com.king.tv;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.king.base.util.LogUtils;
import com.king.thread.nevercrash.NeverCrash;
import com.king.tv.dao.greendao.DaoMaster;
import com.king.tv.dao.greendao.DaoSession;
import com.king.tv.di.component.AppComponent;
import com.king.tv.di.component.DaggerAppComponent;
import com.king.tv.di.module.AppModule;
import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/2/13
 */

public class App extends Application {

    private static final String BUGLY_ID  = "28aeafeef1";

    private DaoMaster.DevOpenHelper mHelper;

    private DaoSession mDaoSession;

    private AppComponent mAppComponent;


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        MultiDex.install(base);
        Beta.installTinker();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initDatabase();
        // 调试时，将第三个参数改为true
        Bugly.init(this,BUGLY_ID,false);
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this,Constants.BASE_URL)).build();

        NeverCrash.init(new NeverCrash.CrashHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                CrashReport.postCatchedException(e);
            }
        });
    }



    public void initDatabase(){
        mHelper = new DaoMaster.DevOpenHelper(this,"tv-db",null);

        DaoMaster daoMaster = new DaoMaster(mHelper.getWritableDatabase());

        mDaoSession = daoMaster.newSession();
    }

    public AppComponent getAppCommponent(){
        return mAppComponent;
    }

    public DaoSession getDaoSession(){
        return mDaoSession;
    }

}
