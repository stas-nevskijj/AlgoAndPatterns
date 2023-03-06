package org.example.patterns.singleton;

public class Singleton {

    enum MySingleton {
        INSTANCE;
    }
    private static final Singleton singleton = new Singleton();

    public Singleton getInstance() {
        return singleton;
    }
    private Singleton() {
    }

    public static void main(String[] args) {
//        singleton.someMethod();
//        someOtherLocalMethod();
    }
}
