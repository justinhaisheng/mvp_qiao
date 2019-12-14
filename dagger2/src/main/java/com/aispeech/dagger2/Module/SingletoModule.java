package com.aispeech.dagger2.Module;

import com.aispeech.dagger2.annotation.Sin;
import com.aispeech.dagger2.annotation.Work;
import com.aispeech.dagger2.bean.activity.SingleActivity;
import com.aispeech.dagger2.bean.activity.WorkActivity;
import com.aispeech.dagger2.bean.activity.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/14 11:54
 * @描述
 */
@Module
public abstract class SingletoModule {

    @Binds
    @Sin
    @Singleton
    abstract BaseActivity bindSingle(SingleActivity activity);

    @Binds
    @Work
    abstract BaseActivity bindWActvity(WorkActivity workActivity);
}
