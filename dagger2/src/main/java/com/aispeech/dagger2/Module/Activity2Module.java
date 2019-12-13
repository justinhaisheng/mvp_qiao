package com.aispeech.dagger2.Module;

import com.aispeech.dagger2.annotation.Home;
import com.aispeech.dagger2.annotation.Work;
import com.aispeech.dagger2.bean.activity.GoActivity;
import com.aispeech.dagger2.bean.activity.HomeActivity;
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
    @Home
    abstract BaseActivity bindWActvity(WorkActivity workActivity);

    @Binds
    abstract IActivity bindIActivity(GoActivity goActivity);

    @Binds
    @Work
    abstract BaseActivity bindHActvity(HomeActivity homeActivity);
}
