package thread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("MyRunnable: " + Thread.currentThread().getName());
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
