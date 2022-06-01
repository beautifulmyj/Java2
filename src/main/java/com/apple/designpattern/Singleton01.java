package com.apple.designpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Singleton01 {
    private static final Singleton01 instance = new Singleton01();
    private Singleton01() {}
    public static Singleton01 getInstance() {
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        Singleton01 instance1 = Singleton01.getInstance();
        Thread.sleep(3000);
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1 == instance2);

        ArrayList<String> strings = new ArrayList<>();
        HashSet<String> strings1 = new HashSet<>();
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
    }
}
