package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i<10; i++) numbers.add(i);

        numbers.addLast(12);//add element to the end
        for (Integer i : numbers) System.out.println(i);//iteration
        for (int i = 2; i<numbers.size();i++) System.out.println(numbers.get(i));//iteration starting from specific index
        for (int i = numbers.size()-1; i>=0; i--) System.out.println(numbers.get(i));//Iteration reverse
        numbers.add(2,5); //insert element to specific position
        numbers.addFirst(50);
        numbers.addLast(60); // add at first and last position
        System.out.println(numbers.offerFirst(100) + " " + numbers.getFirst());//offersFirst return boolean and add element at first position
        System.out.println(numbers.offerLast(500) + " " + numbers.getLast()); // the same as previous but only for last position

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(250);
        list2.add(370);
        list2.addAll(1, numbers);//add element starting from specific index
        System.out.println(list2.getFirst() + " " + list2.getLast());//get first and last element
        for(int i = 0; i< list2.size(); i++) System.out.println("Index = " + i + " Value = " + list2.get(i)); //show index and value
        list2.remove(3);//remove
        list2.removeFirst();
        list2.removeLast(); //remove fist and last element
        list2.removeAll(list2);//remove all
        Collections.swap(numbers,5,7); // swap
        Collections.shuffle(numbers);//shuffle
        LinkedList<Integer> commonList = new LinkedList<>();
        commonList.addAll(numbers);
        commonList.addAll(list2); // combine two lists
        LinkedList<Integer> anotherList = (LinkedList<Integer>)numbers.clone(); // clone
        System.out.println(anotherList);
        System.out.println(anotherList.pollFirst());//or pop,or poll first element
        System.out.println(anotherList);
        System.out.println(anotherList.peekFirst());//return but not remove first element
        System.out.println(anotherList.peekLast());//return last element
        System.out.println(anotherList.contains(600));//check for particular element
        ArrayList<Integer> arrayList = new ArrayList<>(numbers);//from linked list to array list
        System.out.println(numbers.containsAll(anotherList));//compare two linked lists
        System.out.println(numbers.isEmpty()); //empty or not
        numbers.set(0,5);//replace element







    }

}
