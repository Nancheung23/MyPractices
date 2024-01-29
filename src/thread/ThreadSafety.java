package thread;

public class ThreadSafety {
    public static void main(String[] args) {
        // 1. account obj
        Account acc = new Account(100000.0, "ICBC-101");

        // 2. thread objs
        new DrawThread(acc, "a").start();
        new DrawThread(acc, "b").start();

        // 3. account obj
        Account acc1 = new Account(100000.0, "ICBC-102");

        // 4. thread objs
        new DrawThread(acc1, "c").start();
        new DrawThread(acc1, "d").start();

        // efficiency: sync block > func
    }
}
