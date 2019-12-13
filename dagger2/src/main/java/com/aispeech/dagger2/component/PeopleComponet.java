package com.aispeech.dagger2.component;

import android.app.Activity;

import dagger.Component;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 18:22
 * @描述
 */
@Component
public interface PeopleComponet {
    void inject(Activity activity);

}
