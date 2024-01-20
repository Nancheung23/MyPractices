package com.nancheung.innerclass;

public class Test1 {
    public static void main(String[] args) {
//        Swimming cat = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("1m/s");
//            }
//        };
//        Swimming dog = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("1.5m/s");
//            }
//        };
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("1m/s");
            }
        });
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("1.5m/s");
            }
        });
    }

     static void go(Swimming swimming) {
        System.out.println("===================================");
        swimming.swim();
    }
}

interface Swimming {
    void swim();
}