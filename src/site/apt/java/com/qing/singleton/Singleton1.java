package com.qing.singleton;

import cn.hutool.core.util.ObjectUtil;

public class Singleton1 {

    //region饿汉式说明
//        在类装载的时候就完成了实例化,不会存在线程问题,但会造成内存空间的浪费
    //endregion

    //1.私有化构造器
    private Singleton1(){
    }

    //2.类内部创建实例对象
    private static Singleton1 instance = new Singleton1();

    //3.提供public静态方法 获取实例对象
    private static Singleton1 getInstance(){
        return instance;
    }
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        if (instance1.hashCode() == instance2.hashCode()){
            System.out.println("这是懒汉式");
        }
    }
}
