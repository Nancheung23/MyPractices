package com.nancheung.innerclass;

public class Outer {
    private int age = 26;
    public class Inner {
        private int age = 25;
        private String name;
        // JDK 16
        public static String strength = "100mph";
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void test(){
            int age = 24;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age);
        }
    }
}
