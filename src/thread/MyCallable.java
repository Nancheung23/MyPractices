package thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "Thread result 1-" + n + ": " + sum; 
    }
    
}
