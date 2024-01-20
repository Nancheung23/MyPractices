package com.nancheung.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_stream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"a","b","c","d","e");
        Stream<String> stream = names.stream();

        Set<String> set = new HashSet<>();
        Collections.addAll(set,"a","b","c","d","e");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("a")).forEach(System.out::println);

        Map<String,Double> map = new HashMap<>();
        map.put("a",172.3);
        map.put("b",168.3);
        map.put("c",166.3);
        map.put("d",168.3);
        // 1.
        List<String> list = map.keySet().stream().toList();
        // 2.
        Set<Double> set1 = map.values().stream().collect(Collectors.toSet());

        String[] names2 = {"a","b","c","d","e"};
        Stream<String> s1 = Arrays.stream(names2);
        Stream<String> s2 = Stream.of(names2);
    }
}
