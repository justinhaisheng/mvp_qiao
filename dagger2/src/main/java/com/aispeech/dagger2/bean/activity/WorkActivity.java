package com.aispeech.dagger2.bean.activity;

import com.aispeech.dagger2.bean.activity.base.BaseActivity;

import javax.inject.Inject;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:36
 * @描述
 */
public  class WorkActivity extends BaseActivity {

    @Inject
    public WorkActivity(){

    }

    @Override
    public String onCreate() {
        return "Work actvity";
    }
}
