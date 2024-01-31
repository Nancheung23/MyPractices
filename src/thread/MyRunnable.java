package thread;

public class MyRunnable implements Runnable{
    private int count;
    @Override
    public void run() {
        try {
            System.out.println("MyRunnable: " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                synchronized(this){
                    System.out.println("count ==>" + (++count));
                }
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
