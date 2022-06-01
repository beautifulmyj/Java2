package com.apple.thread;

public class ThreadDemo004 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Apple");
            }
        }, "first_thread").start();
    }
}
