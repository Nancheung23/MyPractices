package io_1;

public class recursionTest1 {
    public static void main(String[] args) {
        test1(10);
        System.out.println();
        test2(10);
    }

    // recursion, (*StackOverflowError)
    public static void test1(int count) throws StackOverflowError{
        System.out.println("====test 1====");
        count--;
        if (count == 0) {
            return;
        }
        test1(count);
    }
    
    // not direct recursion
    public static void test2(int count) throws StackOverflowError{
        System.out.println("====test 2====");
        count--;
        if (count == 0) {
            return;
        }
        test3(count);
    }

    public static void test3(int count) throws StackOverflowError{
        System.out.println("====test 3====");
        count--;
        if (count == 0) {
            return;
        }
        test2(count);
    }
}
