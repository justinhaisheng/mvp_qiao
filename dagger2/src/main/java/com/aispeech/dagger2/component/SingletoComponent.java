package com.aispeech.dagger2.component;

import com.aispeech.dagger2.Module.SingletoModule;
import com.aispeech.dagger2.SingletonActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/14 11:58
 * @描述
 */
@Singleton
@Component(modules = SingletoModule.class)
public interface SingletoComponent {
    void inject(SingletonActivity activity);
}
