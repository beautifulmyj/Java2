package com.apple.thread;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchDemo {
    private static final Integer NTHREADS = 6;
    public static void main(String[] args) throws InterruptedException {
        // 1. Init a CountDownLatch object with a count
        CountDownLatch countDownLatch = new CountDownLatch(NTHREADS);
        for (int i = 0; i < NTHREADS; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                // 2. count - 1
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }
        // 3. wait until all threads ended
        countDownLatch.await();
        // wait is a method of Object. Pay attention.
        // countDownLatch.wait();
        System.out.println(Thread.currentThread().getName());
    }

}
