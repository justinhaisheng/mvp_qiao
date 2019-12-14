package com.aispeech.dagger2.component;

import android.app.Application;

import com.aispeech.dagger2.annotation.AppScope;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:44
 * @描述
 */
@AppScope
@Component
public interface AppComponent {
   StuComponent student();
   TeaComponent teacher();

    @Component.Builder
    interface Builder{
        AppComponent build();

        @BindsInstance
        Builder application(Application application);
    }

}
