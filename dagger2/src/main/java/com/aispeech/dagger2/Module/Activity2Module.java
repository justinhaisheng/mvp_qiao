package com.aispeech.dagger2.Module;

import com.aispeech.dagger2.bean.activity.GoActivity;
import com.aispeech.dagger2.bean.activity.WorkActivity;
import com.aispeech.dagger2.bean.activity.base.BaseActivity;
import com.aispeech.dagger2.bean.activity.base.IActivity;

import dagger.Binds;
import dagger.Module;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:37
 * @描述
 */
@Module
public abstract class Activity2Module {

    @Binds
    abstract BaseActivity bindActvity(WorkActivity workActivity);

    @Binds
    abstract IActivity bindIActivity(GoActivity goActivity);
}
