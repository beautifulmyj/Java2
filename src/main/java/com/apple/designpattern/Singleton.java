package com.apple.designpattern;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        Singleton instance1 = Singleton.getInstance();
        Thread.sleep(3000);
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}