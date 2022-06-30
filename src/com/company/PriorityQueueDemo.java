package com.company;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        // tasks 2,3,5,6,7,8,9 done before
        queue.add("black");
        queue.add("white");
        queue.add("yellow");
        System.out.println(queue);
        String [] array = queue.toArray(new String[0]);
        for(String s : queue) System.out.println(s.toString());
    }
}
