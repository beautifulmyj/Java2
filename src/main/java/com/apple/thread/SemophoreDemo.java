package com.apple.thread;

import java.util.concurrent.Semaphore;

public class SemophoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(6);

        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, String.valueOf(i)).start();
        }
    }
}
