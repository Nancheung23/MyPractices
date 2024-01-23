package io_1;

public class recursionTest3 {
    public static void main(String[] args) {
        // f(10) = 1
        // f(x) - f(x) / 2 - 1= f(x + 1)
        // f(n) = f(n - 1) / 2 - 1
        System.out.println(monkey(1));
    
    }

    public static int monkey(int day) throws StackOverflowError {
        if (day == 10) {
            return 1;
        } else {
            return (monkey(day + 1) + 1) * 2;
        }
    }
}
