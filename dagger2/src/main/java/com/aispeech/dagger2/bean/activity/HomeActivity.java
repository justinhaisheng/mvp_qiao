package com.aispeech.dagger2.bean.activity;

import com.aispeech.dagger2.bean.activity.base.BaseActivity;

import javax.inject.Inject;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:35
 * @描述
 */
public class HomeActivity extends BaseActivity {

    @Inject
    public HomeActivity(){

    }

    @Override
    public String onCreate() {
        return "home create";
    }
}
