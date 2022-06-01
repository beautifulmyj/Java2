package com.apple.designpattern;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadpoolUtil {
    private static ThreadPoolExecutor threadPoolExecutor = null;
    private ThreadpoolUtil() {}

    public static ThreadPoolExecutor getInstance() {
        if (threadPoolExecutor == null) {
            synchronized (ThreadpoolUtil.class) {
                if (threadPoolExecutor == null) {
                    threadPoolExecutor = new ThreadPoolExecutor(
                            4,
                            10,
                            300,
                            TimeUnit.SECONDS,
                            new LinkedBlockingDeque<>(10));
                }
            }
        }
        return threadPoolExecutor;
    }
}
