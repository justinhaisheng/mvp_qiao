package com.aispeech.dagger2.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/14 12:35
 * @描述
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AppScope {
}
