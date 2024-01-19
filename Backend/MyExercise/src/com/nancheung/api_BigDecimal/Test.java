package com.nancheung.api_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.3;
        double c = a + b;
        System.out.println(c);
        System.out.println("============================");

        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        System.out.println(a1.add(b1));
        System.out.println(a1.subtract(b1));
        System.out.println(a1.multiply(b1));
        System.out.println(a1.divide(b1, 2, RoundingMode.HALF_UP));
    }
}
