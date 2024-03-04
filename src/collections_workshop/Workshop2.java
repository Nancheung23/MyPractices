package collections_workshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
}

public class Workshop2 {
    public static void main(String[] args) {
        // 01
        int a = 10;
        int b = 3;
        int c = 88;
        Map<String, Integer> varMap = new HashMap<>();
        varMap.put("a", a);
        varMap.put("b", b);
        varMap.put("c", c);
        System.out.println(varMap);
        // 02
        System.out.println("a's Value: " + varMap.get("a"));
        System.out.println("c's Value: " + varMap.get("c"));
        // 03
        Map<String, String> user_Map = Map.of(
                "johnwick12", "h!tm4n",
                "TonyStark1122", "!r0nm4n",
                "SelinaKyle9999", "c4tw0m4n");
        Map<String, String> userMap = new HashMap<>(user_Map);
        userMap.forEach((k, v) -> System.out.println(k + " : " + v));
        // 04
        userMap.remove("johnwick12");
        userMap.forEach((k, v) -> System.out.println(k + " : " + v));
        // 05
        System.out.println(userMap.containsValue("h!tm4n") ? "Yes" : "No");
        // 06
        System.out.println(userMap.containsValue("SelinaKyle9999") ? "Yes" : "No");
        System.out.println(userMap.containsKey("SelinaKyle9999") ? "Yes" : "No");
        // 07
        System.out.println("Map length: " + userMap.size());
        // 08
        userMap.replace("TonyStark1122", "b3tt3rp@ssw0rd");
        userMap.forEach((k, v) -> System.out.println(k + " : " + v));
        // 09
        System.out.println("Key set: ");
        userMap.keySet().forEach(System.out::println);
        System.out.println("Value set: ");
        userMap.values().forEach(System.out::println);
        // 10
        userMap.forEach((k, v) -> System.out.println(k + " : " + v));
        // 11 done
        // 12
        Map<Integer, Person> positionMap = new HashMap<Integer, Person>();
        Person haley = new Person("Haley", 22);
        Person alex = new Person("Alex", 20);
        Person luke = new Person("Luke", 18);
        positionMap.put(1, haley);
        positionMap.put(2, alex);
        positionMap.put(3, luke);
        System.out.println(positionMap);
        // 13 done
        // 14
        System.out.println(positionMap.containsValue(haley) ? "Yes" : "No");
        // 15.1 entrySet()
        Set<Map.Entry<Integer, Person>> entrySet = positionMap.entrySet();
        System.out.println(entrySet);
        // 15.2 keySet()
        Set<Integer> keySet = positionMap.keySet();
        System.out.println(keySet);
        // 15.3 V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        Map<String, Integer> scores = new HashMap<>();
        scores.put("A", 15);
        scores.put("B", 20);
        scores.compute("A", (k, v) -> (v == null) ? 10 : v + 10);
        scores.compute("B", (k, v) -> (v == null) ? 10 : v + 10);
        scores.compute("C", (k, v) -> (v == null) ? 10 : v + 10);
        System.out.println(scores);
        // 15.4 V getOrDefault(Object key, V defaultValue)
        System.out.println("D : " + scores.getOrDefault("D", 30));
    }
}
