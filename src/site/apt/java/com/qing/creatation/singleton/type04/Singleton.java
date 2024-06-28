package com.qing.singleton.type04;

import cn.hutool.core.util.ObjectUtil;

public class Singleton {

    private Singleton(){

    }

    private static Singleton singleton;

    public static Singleton getInstance(){
        if (ObjectUtil.isEmpty(singleton)) {
            synchronized (Singleton.class){
                if (ObjectUtil.isEmpty(singleton)) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
