package thread;

public class threadTest4 {
    public static void main(String[] args) throws Exception {
        // sleep 
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) {
                Thread.sleep(5000);
            }
        }

        // join (order: 1-> 2-> 3)
        Thread t1 = new MyThread("first");
        t1.start();
        t1.join();

        Thread t2 = new MyThread("second");
        t2.start();
        t2.join();

        Thread t3 = new MyThread("third");
        t3.start();
        t3.join();
    }
}
