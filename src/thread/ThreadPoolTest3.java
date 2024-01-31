package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest3 {
    public static void main(String[] args) {
        // positive lock: lock after safety issue happens : int modify
        // negative lock: lock at first

        // CAS algorithm
        ExecutorService pool = Executors.newFixedThreadPool(17);
        Runnable target = new MyRunnable2();

        for (int i = 1; i <= 100; i++) {
            pool.execute(target);
        }
        pool.shutdown();
    }
}
