package io_1;

public class tryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // except System.exit(0), JVM shut down, finally will execute
            System.out.println("===finally===");
        }
        System.out.println(divide(10, 2));
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            // don't return, or divide will only return int from finally
            System.out.println("executed");
        }
    }
}
