package com.qing.singleton.type07;

public enum Singleton {
    INSTANCE,
}
class SingletonTest{
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance.hashCode() == instance2.hashCode());
    }
}
