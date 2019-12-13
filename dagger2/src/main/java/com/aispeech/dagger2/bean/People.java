package com.aispeech.dagger2.bean;

import javax.inject.Inject;

/**
 * @创建者 luhaisheng
 * @创建时间 2019/12/13 19:04
 * @描述
 */
public class People {

    private Tools tools;

    @Inject
    public People(Tools tools){
        this.tools = tools;
    }

    public String doWhat(){
        return "eat" + tools.getCar();
    }

}
