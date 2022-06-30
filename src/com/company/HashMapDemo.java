package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("thee", 3);
        // tasks 2,3,4,5,6 done before
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(2));
        Set set = map.entrySet();
        System.out.println(set);// make set view
        System.out.println(map);
        System.out.println(map.get("two"));
        System.out.println(map.keySet());//key set
        System.out.println(map.values()); // values

    }
}
