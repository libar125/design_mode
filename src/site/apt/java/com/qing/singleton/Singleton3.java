package com.qing.singleton;

import cn.hutool.core.util.ObjectUtil;

public class Singleton3 {
    public static void main(String[] args) {
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        if (instance1.hashCode() == instance2.hashCode()){
            System.out.println("这是懒汉式");
        }
    }

}

class Singleton01{
    //懒汉式
    //1.私有化构造方法 在外部无法new
    private  Singleton01(){
        System.out.println("我实例化了");
    }

    //2.提供静态方法
    private static Singleton01 instance;

    //3
    public static synchronized Singleton01 getInstance(){
        if (ObjectUtil.isEmpty(instance)){
            instance = new Singleton01();
        }
        return instance;
    }
}