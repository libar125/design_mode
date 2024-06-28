package com.qing.singleton.type03;

import cn.hutool.core.util.ObjectUtil;

public class Singleton {

    private Singleton(){

    }

    private static Singleton singleton;

    private static synchronized Singleton getInstance(){
        if (ObjectUtil.isEmpty(singleton)){
            singleton = new Singleton();
        }
        return singleton;
    }
}
