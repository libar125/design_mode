package com.qing.singleton.type01;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1.hashCode() == instance2.hashCode()){
            System.out.println("饿汉式");
        }
    }
}

class Singleton{
    //1.私有化构造器
    private Singleton(){
    }
    //2.类的内部创建对象
    private static Singleton instance = new Singleton();
    //3.向外暴露一个静态的公共方法
    public static Singleton getInstance(){
        return instance;
    }
}
