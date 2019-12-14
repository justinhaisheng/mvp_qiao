package com.aispeech.dagger2.component;

import com.aispeech.dagger2.Module.StuModule;
import com.aispeech.dagger2.StuActivity;
import com.aispeech.dagger2.annotation.ActivityScope;

import dagger.Subcomponent;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:44
 * @描述
 */
@ActivityScope
@Subcomponent(modules = StuModule.class)
public interface StuComponent {
    void inject(StuActivity activity);

}
