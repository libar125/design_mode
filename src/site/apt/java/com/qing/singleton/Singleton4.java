package com.qing.singleton;

import cn.hutool.core.util.ObjectUtil;

public class Singleton4 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1.hashCode() == instance2.hashCode()){
            System.out.println("双重检查");
        }
    }


}

class Singleton{
    //1.私有化构造器
    private Singleton(){
    }

    //2.类内部创建实例对象
    private static Singleton instance;

    //3.提供public静态方法 获取实例对象
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
