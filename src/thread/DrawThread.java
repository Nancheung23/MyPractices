package thread;

public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc, String threadName) {
        super(threadName);
        this.acc = acc;
        acc.syncOutput();
    }
    @Override
    public void run() {
        // get money
        acc.drawMoney(100000);
    }
}
