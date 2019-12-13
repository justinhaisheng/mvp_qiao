package com.aispeech.dagger2.bean.activity;

import com.aispeech.dagger2.bean.activity.base.IActivity;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:40
 * @描述
 */
public class GoActivity implements IActivity {

    @Override
    public String resume() {
        return "go resume";
    }
}
