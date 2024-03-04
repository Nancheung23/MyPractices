package collections_workshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age!= other.age)
            return false;
        if (name == null) {
            if (other.name!= null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

public class Workshop1 {
    public static void main(String[] args) {
        // 01
        String[] fruit = {"Mango", "Apple", "Pear"};
        for (String content : fruit) {
            System.out.println(content);
        }
        // 02
        List<String> fruitList = new ArrayList<>();
        for (String content : fruit) {
            fruitList.add(content);
        }
        System.out.println(fruitList);
        // 03
        try {
            // works
            fruitList.add("Banana");
            // does not work
            fruit[3] = "Pineapple";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error happened:" + e.getMessage());
        }
        // 04
        fruitList.remove("Banana");
        System.out.println(fruitList);
        // 05
        System.out.println(fruitList.contains("Mango") ? "Yes, it has." : "No, it doesn't have.");
        // 06
        System.out.println("Size of fruitList: " + fruitList.size());
        // 07
        if (fruitList.contains("Apple")) {
            System.out.println("Index: " + fruitList.indexOf("Apple"));
        } else {
            System.out.println("Doesn't have Apple in fruitList.");
        }
        // 08
        fruitList.forEach(e -> System.out.println(fruitList.indexOf(e) + 1 + " : " + e));
        // 09
        Iterator<String> it =  fruitList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 10 done
        // 11
        fruitList.clear();
        System.out.println(fruitList);
        // 12, 13
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Haley", 22));
        peopleList.add(new Person("Alex", 20));
        peopleList.add(new Person("Luke", 18));
        // toString() done
        System.out.println(peopleList);
        // 14, after rewrite equals(), list has person object
        Person person = new Person("Alex", 20);
        System.out.println(peopleList.contains(person) ? "Yes, it has." : "No, it doesn't have.");
        // 15.1 get()
        System.out.println(peopleList.get(1).getName()); // get one obj in list
        // 15.2 set()
        peopleList.set(1, new Person("Nan", 26));
        System.out.println(peopleList.get(1).getName()); // get one obj in list
        // 15.3 addAll()
        ArrayList<Person> peopleList2 = new ArrayList<>(Arrays.asList(new Person("A", 22), new Person("B", 33)));
        if (peopleList.addAll(peopleList2)) {
            System.out.println("Add successfully: " + peopleList);
        } else {
            System.out.println("Add failed: " + peopleList);
        }
        // 15.4 ensureCapacity()
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(100);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println("List length: " + list.size());
    }
}
