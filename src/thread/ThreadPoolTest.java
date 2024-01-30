package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) {
        // interface: Executor -> Class: ThreadPoolExecutor

        // int corePoolSize: number of threads
        // int maximumPoolSize: max value of threads
        // long keepAliveTime: life of thread
        // TimeUnit unit: unit of life (sec, min, hr, day)
        // BlockingQueue<Runnable> workQueue: mission queue of threads
        // ThreadFactory threadFactory: threadFactory for creating thread
        // RejectedExcutionHandler handler: reject policies

        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        Runnable target = new MyRunnable();
        // create threads
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        // reuse & blocking queue
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        // temporary thread
        pool.execute(target);
        pool.execute(target);
        // reject policy
        // ThreadPoolExecutor.AbortPolicy(default), DiscardPolicy(ignore), DiscardOldestPolicy(ignore first), CallerRunsPolicy(main execute)
        pool.execute(target);
        // shutdown
        pool.shutdown();
        // pool.shutdownNow();


        

    }
}
