package com.qing.singleton.type01;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1.hashCode() == instance2.hashCode()){
            System.out.println("静态内部类");
        }
    }

}


class Singleton{

    private Singleton(){

    }

    //静态内部类
    static class A{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return A.singleton;
    }
}
