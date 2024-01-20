package com.nancheung.enumtest;

public class Test {
    public static void main(String[] args) {
        A a = A.X;
        System.out.println(a);

        A a1 = A.Y;

        A[] as = A.values();
        System.out.println(a1.getName());

        A a2 = A.Z;
        System.out.println(a2.ordinal());
    }
}
