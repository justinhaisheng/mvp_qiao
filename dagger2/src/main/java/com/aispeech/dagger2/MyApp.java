package com.aispeech.dagger2;

import android.app.Application;

import com.aispeech.dagger2.component.AppComponent;
import com.aispeech.dagger2.component.DaggerAppComponent;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/14 13:05
 * @描述
 */
public class MyApp extends Application {

    private static MyApp app;
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        component = DaggerAppComponent.builder().application(this).build();
    }

    public static MyApp getApp() {
        return app;
    }

    public AppComponent getComponent() {
        return component;
    }
}
