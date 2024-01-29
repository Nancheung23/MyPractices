package thread;

public class threadTest2 {
    public static void main(String[] args) {
        // create mission object
        Runnable target = new MyRunnable();

        // let thread object handle a mission
        Thread thread = new Thread(target);

        // thread start
        thread.setName("Thread runnable");
        thread.start();
        System.out.println(thread.getName());

        // // main start
        // for (int i = 0; i <= 5; i++) {
        // System.out.println("Main: " + i);
        // }

        // lambda way
        // Thread thread2 = new Thread(new Runnable() {
        // @Override
        // public void run() {
        // for (int i = 0; i <= 5; i++) {
        // System.out.println("MyRunnable2: " + i);
        // }
        // }
        // });
        System.out.println("Running: " + Thread.currentThread());
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("MyRunnable2: " + i);
            }
        });
        thread2.setName("Thread runnable 2");
        thread2.start();
        System.out.println(thread2.getName());

        // main start
        for (int i = 0; i <= 5; i++) {
            System.out.println("Main: " + i);
        }
    }
}
