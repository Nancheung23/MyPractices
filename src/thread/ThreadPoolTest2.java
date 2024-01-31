package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest2 {
    public static void main(String[] args) throws Exception{
        // interface: Executor -> Class: ThreadPoolExecutor

        // int corePoolSize: number of threads
        // int maximumPoolSize: max value of threads
        // long keepAliveTime: life of thread
        // TimeUnit unit: unit of life (sec, min, hr, day)
        // BlockingQueue<Runnable> workQueue: mission queue of threads
        // ThreadFactory threadFactory: threadFactory for creating thread
        // RejectedExcutionHandler handler: reject policies

        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

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

        // 6 states: New, Runnable(start()), Blocked(didn't succeed in competition), Waiting(need to be notified), TimedWaiting(sleep, wait), Terminated(Exception, run())
    }
}
