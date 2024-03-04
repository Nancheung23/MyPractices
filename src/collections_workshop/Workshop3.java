package collections_workshop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
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
        // TODO Auto-generated method stub
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
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null)? 0 : name.hashCode());
        return result;
    }
}

public class Workshop3 {
    public static void main(String[] args) {
        // 01
        Set<String> animalSet = new HashSet<>();
        animalSet.add("Lion");
        animalSet.add("Tiger");
        animalSet.add("Cheetah");
        System.out.println(animalSet);
        // 02
        animalSet.add("Lion");
        System.out.println(animalSet); // cant add same element twice
        // 03
        animalSet.remove("Lion");
        System.out.println(animalSet);
        // 04
        System.out.println("animalSet's length: " + animalSet.size());
        // 05
        System.out.println(animalSet.contains("Rhino") ? "Yes" : "No");
        // 06
        animalSet.forEach(System.out::println);
        // 07
        Iterator<String> it = animalSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 08
        animalSet.clear();
        System.out.println(animalSet);
        // 09
        System.out.println(animalSet.isEmpty() ? "Empty" : "Not Empty");
        // 10 done
        // 11
        Set<Person> peopleSet = new HashSet<Person>();
        Person haley = new Person("Haley", 22);
        Person alex = new Person("Alex", 20);
        Person luke = new Person("Luke", 18);
        peopleSet.add(haley);
        peopleSet.add(alex);
        peopleSet.add(luke);
        System.out.println(peopleSet);
        // 12 done
        // 13
        System.out.println(peopleSet.contains(haley) ? "Yes, it has." : "No, it doesn't have.");
        // 14.1 clone()
        HashSet<Person> peopleSet2 = new HashSet<>(Arrays.asList(new Person("A", 22), new Person("B", 33)));
        @SuppressWarnings("unchecked")
        HashSet<Person> peopleSet3 = (HashSet<Person>) peopleSet2.clone();
        System.out.println(peopleSet3);
        // 14.2 addAll()
        peopleSet.addAll(peopleSet2);
        System.out.println(peopleSet);
        // 14.3 removeAll()
        peopleSet.removeAll(peopleSet2);
        System.out.println(peopleSet);
        // 14.4 retainAll()
        peopleSet.retainAll(peopleSet2);
        System.out.println(peopleSet);

    }
}
