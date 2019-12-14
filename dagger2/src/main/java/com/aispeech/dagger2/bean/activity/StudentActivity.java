package com.aispeech.dagger2.bean.activity;

import android.app.Application;

import com.aispeech.dagger2.bean.activity.base.BaseActivity;

import javax.inject.Inject;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/14 12:40
 * @描述
 */
public class StudentActivity extends BaseActivity {

   // private Application app;

    @Inject
    public StudentActivity(Application app) {
     //   this.app = app;
    }

    @Override
    public String onCreate() {
        return "StudentActivity";
    }
}
