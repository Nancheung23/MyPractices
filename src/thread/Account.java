package thread;

import java.time.LocalDateTime;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double money;
    private String cardID;
    // another way (reentrantLock)
    private final Lock lk = new ReentrantLock();

    public Account(double money, String cardID) {
        this.money = money;
        this.cardID = cardID;
    }

    public Account() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public void drawMoney(double money) {
        // check which thread by name
        String name = Thread.currentThread().getName();
        // check enough money
        // synchronize lock (use share resource as the lock)
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + " get :" + money + "Successful");
                this.money -= money;
                System.out.println("Balance: " + name + getMoney());
            } else {
                System.out.println(name + ": not enough money");
            }
        }
    }

    // another way (add keyword)
    public synchronized void drawMoneyWithSync(double money) {
        String name = Thread.currentThread().getName();
        if (this.money >= money) {
            System.out.println(name + " get :" + money + "Successful");
            this.money -= money;
            System.out.println("Balance: " + name + getMoney());
        } else {
            System.out.println(name + ": not enough money");
        }
    }

    // another way (reentrantLock) -> lock/ unlock
    public void drawMoneyWithReentrantLock(double money) {
        String name = Thread.currentThread().getName();
        lk.lock();
        try {
            if (this.money >= money) {
                System.out.println(name + " get :" + money + "Successful");
                this.money -= money;
                System.out.println("Balance: " + name + getMoney());
            } else {
                System.out.println(name + ": not enough money");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock();
        }
    }

    public static void syncOutput() {
        // use byte code: classname.class as lock obj
        synchronized (Account.class) {
            System.out.println("Static func" + (LocalDateTime.now()).toString());
        }
    }
}
