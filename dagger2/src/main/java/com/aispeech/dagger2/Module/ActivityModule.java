package com.aispeech.dagger2.Module;

import com.aispeech.dagger2.bean.activity.GoActivity;
import com.aispeech.dagger2.bean.activity.HomeActivity;
import com.aispeech.dagger2.bean.activity.base.BaseActivity;
import com.aispeech.dagger2.bean.activity.base.IActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:37
 * @描述
 */
@Module
public class ActivityModule {

    @Provides
    BaseActivity getHomeActivity(){
        return new HomeActivity();
    }

//    @Provides
//    BaseActivity getWorkActivity(){
//        return new WorkActivity();
//    }

    @Provides
    IActivity getGoActivity(){
        return new GoActivity();
    }
}
