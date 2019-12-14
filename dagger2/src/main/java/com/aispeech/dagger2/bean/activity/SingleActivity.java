package com.aispeech.dagger2.bean.activity;

import com.aispeech.dagger2.bean.activity.base.BaseActivity;

import javax.inject.Inject;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/14 11:55
 * @描述
 */
public class SingleActivity extends BaseActivity {
    @Inject
    public SingleActivity(){

    }
    @Override
    public String onCreate() {
        return "single";
    }
}
