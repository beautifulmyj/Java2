import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolUtil {
    private static ThreadPoolExecutor threadPoolExecutor = null;
    private ThreadPoolUtil() {}
    public static ThreadPoolExecutor getThreadPoolExecutor() {
        if (threadPoolExecutor == null) {
            synchronized (ThreadPoolUtil.class) {
                if (threadPoolExecutor == null) {
                    threadPoolExecutor = new ThreadPoolExecutor(
                            10,
                            20,
                            60,
                            TimeUnit.SECONDS,
                            new LinkedBlockingDeque<Runnable>(20));
                }
            }
        }
        return threadPoolExecutor;
    }
}
