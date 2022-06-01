package com.apple;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class Singleton {
    private static ThreadPoolExecutor threadPoolExecutor = null;

    private Singleton() {
    }

    public static ThreadPoolExecutor getThreadPoolExecutor() {

        if (threadPoolExecutor == null) {
            synchronized (Singleton.class) {
                if (threadPoolExecutor == null) {
                    threadPoolExecutor = new ThreadPoolExecutor(4,
                            20,
                            60,
                            TimeUnit.SECONDS,
                            new LinkedBlockingDeque<>());
                }
            }
        }
        return threadPoolExecutor;
    }
}