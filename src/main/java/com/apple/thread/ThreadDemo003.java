package com.apple.thread;

import java.util.concurrent.Callable;

public class ThreadDemo003 {
    public static void main(String[] args) {

    }
}

class Thread01 implements Runnable {
    @Override
    public void run() {

    }
}

class Thread02 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Apple";
    }
}