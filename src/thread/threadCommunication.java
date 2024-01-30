package thread;

public class threadCommunication {
    public static void main(String[] args) {
        Desk desk = new Desk();
        // create 5 threads
        new Thread(() -> {
            desk.put();
        }, "first").start();

        new Thread(() -> {
            desk.put();
        }, "second").start();

        new Thread(() -> {
            desk.put();
        }, "third").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "FIRST").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "SECOND").start();
    }
}
