package com.aispeech.dagger2.component;

import com.aispeech.dagger2.DaggerActivity;
import com.aispeech.dagger2.Module.ActivityModule;

import dagger.Component;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:44
 * @描述
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(DaggerActivity activity);
}
