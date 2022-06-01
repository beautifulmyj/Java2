package com.apple.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo006 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = ThreadPoolUtil.getThreadPool();

        threadPool.submit(new MyThread());

        threadPool.submit(new MyCallable("JiaoJiao"));

        threadPool.shutdown();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Apple");
    }
}

class MyCallable implements Callable<String> {

    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        return "";
    }
}