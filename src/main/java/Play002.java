import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadPoolExecutor;

public class Play002 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = ThreadPoolUtil.getThreadPoolExecutor();
        Singleton instance = Singleton.getInstance();
    }

    @Test
    public void run() {
        System.out.println("Apple");
    }
}
