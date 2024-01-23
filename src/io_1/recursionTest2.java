package io_1;

public class recursionTest2 {
    public static void main(String[] args) {
        System.out.println(recursionN(10));
        System.out.println(recursionSumN(10));
    }

    // n!
    public static int recursionN(int limit) throws StackOverflowError{
        if (limit == 1) {
            return 1;
        } else {
            return recursionN(limit - 1)*limit;
        }
    }
    // 1+...n
    public static int recursionSumN(int limit) throws StackOverflowError {
        if (limit == 1) {
            return 1;
        } else {
            return recursionSumN(limit - 1) + limit;
        }
    }
}
