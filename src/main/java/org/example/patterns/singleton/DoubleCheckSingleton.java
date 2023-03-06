package org.example.patterns.singleton;

public class DoubleCheckSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
    static class Singleton {
        private static volatile Singleton singleton;

        public static Singleton getInstance() {
            if (singleton == null) {
                synchronized (Singleton.class) {
                    if (singleton == null) {
                        singleton = new Singleton();
                    }
                }
            }
            return singleton;
        }
    }
}
