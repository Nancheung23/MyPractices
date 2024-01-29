package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class threadTest3 {
    public static void main(String[] args) throws Exception{
        // callable, futureTask
        Callable<String> call = new MyCallable(100);
        // FutureTask implements runnable interface
        FutureTask<String> f1 = new FutureTask<>(call);
        // handle by thread
        Thread thread = new Thread(f1);
        thread.start();

        // get result
        String rs = f1.get();
        System.out.println(rs);
    }
}
