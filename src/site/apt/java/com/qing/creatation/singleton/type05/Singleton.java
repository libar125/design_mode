package com.qing.singleton.type05;

public class Singleton {

    private Singleton(){

    }

    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return singleton;
    }
}

class SingletonTest{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton2.hashCode() == singleton1.hashCode()){
            System.out.println("静态代码块");
        }
    }
}
