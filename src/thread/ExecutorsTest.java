package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsTest {
    public static void main(String[] args) throws Exception{
        // newFixedThreadPool, newSingleThreadExecutor, newCachedThreadPool, newScheduledThreadPool

        // *Calculation based scenario: corePoolSize = (cores of CPU) + 1
        // *IO based scenario: corePoolSize * 2
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // Callable execute
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

        pool.shutdown();
    }
}
