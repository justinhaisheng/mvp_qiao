package com.aispeech.dagger2.Module;

import com.aispeech.dagger2.annotation.ActivityScope;
import com.aispeech.dagger2.bean.activity.TeacherActivity;
import com.aispeech.dagger2.bean.activity.base.BaseActivity;

import dagger.Binds;
import dagger.Module;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/14 12:53
 * @描述
 */
@Module
public abstract class TeaModule {

    @Binds
    @ActivityScope
    abstract BaseActivity bindTeacher(TeacherActivity activity);

}
