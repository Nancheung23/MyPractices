package com.nancheung.Lambda;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void run() {
                System.out.println("Dog can run!");
            }
        };
        dog.run();

//        Swimming swimmingDog = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("Dog can swim!");
//            }
//        };
        Swimming swimmingDog = () -> {
            System.out.println("Dog can swim!");
        };
        swimmingDog.swim();
    }
}

interface Swimming {
    void swim();
}

abstract class Animal {
    public abstract void run();
}
