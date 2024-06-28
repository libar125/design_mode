package com.qing.singleton.type06;

public enum Singleton {
    INSTANCE,
}

class SingletonTest{
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        if (instance1 == instance2) {
            System.out.println("枚举单例");
        }
    }
}
