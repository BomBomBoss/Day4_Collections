package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(7);
        // tasks 1,2,4,5,6,9,10,12 done before in ArrayList and LinkedList
        System.out.println(hashSet.size()); //set size
        Integer [] numbers = hashSet.toArray(new Integer[0]);//convert hashset to array
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);//convert to treeSet
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(10);
        hashSet.retainAll(hashSet2);//retains same elements in both sets
        System.out.println(hashSet);





    }
}
