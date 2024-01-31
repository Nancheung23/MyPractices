package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable2 implements Runnable{
    // private int count;
    // positive lock
    private AtomicInteger count = new AtomicInteger();
    @Override
    public void run() {
        try {
            System.out.println("MyRunnable2: " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                synchronized(this){
                    System.out.println("count ==>" + count.incrementAndGet());
                }
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
