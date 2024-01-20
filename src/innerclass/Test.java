package com.nancheung.innerclass;

public class Test {
    public static void main(String[] args) {
        Outer test = new Outer();
        Outer.Inner test1 = test.new Inner();
        test1.setName("nan");
        System.out.println(test1.getName() + " " + Outer.Inner.strength);
        test1.test();
        System.out.println("-----------------------------------");

        Animal animal = new Animal() {
            @Override
            public void cry() {
                System.out.println("Meow.");
            }
        };
        animal.cry();
    }
}

abstract class Animal {
    public abstract void cry();
}

//class Cat extends Animal {
//    @Override
//    public void cry() {
//        System.out.println("Meow.");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    public void cry() {
//        System.out.println("Woof.");
//    }
//}

