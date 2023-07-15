package com.qing.singleton.type02;


import cn.hutool.core.util.ObjectUtil;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1.hashCode() == instance2.hashCode()) {
            System.out.println("饿汉式");
        }
    }
}

class Singleton {
    //1.私有化构造器
    private Singleton() {
    }

    //2.类的内部创建对象
    private static Singleton singleton;

    //3.向外暴露一个静态的公共方法
    public static Singleton getInstance() {
        if (ObjectUtil.isEmpty(singleton)) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
