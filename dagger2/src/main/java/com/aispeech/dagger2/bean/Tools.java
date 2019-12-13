package com.aispeech.dagger2.bean;

import javax.inject.Inject;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:27
 * @描述
 */
public class Tools {

    @Inject
    public Tools(){

    }

    public String getCar(){
        return "car";
    }

}
