package thread;

public class threadTest1 {
    public static void main(String[] args) {
        // create object
        Thread thread = new MyThread();

        // start thread
        thread.start(); // 2 threads: main, thread
        System.out.println(thread.getName());

        // get name: static currentThread()
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        // main
        for (int i = 0; i <= 5; i++) {
            System.out.println("MainThread: " + i);
        }
        // thread before main thread
    }
}
