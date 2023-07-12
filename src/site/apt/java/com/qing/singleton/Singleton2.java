package com.qing.singleton;

import cn.hutool.core.util.ObjectUtil;

public class Singleton2 {

    //非静态代码块：
    //执行的时候如果有静态初始化块，先执行静态初始化块再执行非静态初始化块，在每个对象生成时都会被执行一次，它可以初始化类的实例变量。
    //非静态初始化块会在构造函数执行时，在构造函数主体代码执行之前被运行。

    //静态代码块
    //随着类的加载而执行，而且只执行一次


    //饿汉式 静态代码块
    //1.私有化构造器
    private Singleton2(){
    }

    //2.类内部创建实例对象
    private static Singleton2 instance;

    //静态代码块
    static {
        instance = new Singleton2();
    }

    //3.提供public静态方法 获取实例对象
    private static Singleton2 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        if (instance1.hashCode() == instance2.hashCode()){
            System.out.println("这是饿汉式");
        }
    }

}