package com.company;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("black");
        treeSet.add("white");
        treeSet.add("red");
        treeSet.add("blue");
        // tasks 2,3,5,6,7,8, 14,15,16 done before
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());//descending order
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(5);
        treeSet1.add(8);
        treeSet1.add(4);
        System.out.println(treeSet1.headSet(7));//numbers before 7
        System.out.println(treeSet1.ceiling(7));//equal or greater
        System.out.println(treeSet1.floor(7)); // equal or less
        System.out.println(treeSet1.higher(5));//greater
        System.out.println(treeSet1.lower(5)); // less





    }
}
