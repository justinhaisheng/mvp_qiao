package com.aispeech.dagger2.Module;

import com.aispeech.dagger2.annotation.ActivityScope;
import com.aispeech.dagger2.bean.activity.StudentActivity;
import com.aispeech.dagger2.bean.activity.base.BaseActivity;

import dagger.Binds;
import dagger.Module;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/14 12:53
 * @描述
 */
@Module
public abstract class StuModule {

    @Binds
    @ActivityScope
    abstract BaseActivity bindStudent(StudentActivity activity);

}
