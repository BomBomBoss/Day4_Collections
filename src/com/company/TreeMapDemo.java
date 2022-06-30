package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>(new Comparator<String>() { // comparing
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        treeMap.put("two", 2);
        treeMap.put("one", 1);
        treeMap.put("three", 3);
        // tasks 2,5,6,11,12,13,14,15,16,17 done before
        System.out.println(treeMap.containsKey("one"));//key search
        System.out.println(treeMap.containsValue(2));//value search
        System.out.println(treeMap.firstEntry()); // get first entry
        System.out.println(treeMap.lastEntry()); // get last entry
        System.out.println(treeMap.firstKey()); // first key
        System.out.println(treeMap.lastKey()); // last key
        System.out.println(treeMap.descendingKeySet()); // reverse sort
        System.out.println(treeMap.navigableKeySet()); // navigable key set
        System.out.println(treeMap.pollLastEntry());//remove and return last entry
        System.out.println(treeMap.pollFirstEntry()); // remove and return first entry
        System.out.println(treeMap.subMap("three", "two"));
        System.out.println(treeMap.subMap("three",true, "two",true));
        System.out.println(treeMap.tailMap("two"));
        System.out.println(treeMap.tailMap("one,", false));
        System.out.println(treeMap.ceilingEntry("two"));
        System.out.println(treeMap.ceilingKey("one"));

    }
}
