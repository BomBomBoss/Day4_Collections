package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("white");
        System.out.println(colors);

        for(String s : colors) System.out.println(s);//iteration

        colors.add(0,"yellow"); //add at 1 position

        System.out.println(colors.get(2)); // retrieve element -> red

        colors.set(2, "purple"); // red replaced with purple

        colors.remove(2); // removed 3rd element

        if (colors.contains("white")) System.out.println("Color is in the list"); // find element
        else System.out.println("There is no such color");

        Collections.sort(colors); // list sorting

        ArrayList<String> toCopyColors = new ArrayList<>(colors);// copy list to another list
        ArrayList<String> toCopyColors2 = new ArrayList<>();
        toCopyColors2.add("some color-1");
        toCopyColors2.add("some color-2");
        toCopyColors2.add("some color-3");
        Collections.copy(toCopyColors,toCopyColors2);

        Collections.shuffle(colors); //shuffle

        Collections.reverse(toCopyColors); // reverse

        System.out.println(colors.subList(0,2));//portion

        System.out.println(colors.containsAll(toCopyColors2)); // comparison

        Collections.swap(colors, 1,4); // swapping

        colors.addAll(toCopyColors); // add one collection one to other

        ArrayList<String> cloneList = new ArrayList<>(colors);// clone collection, same as copy at list initialization step

        colors.clear();// clear

        colors = (ArrayList<String>) cloneList.clone();//another clone
        System.out.println("List \"colors\" is empty? - "+ colors.isEmpty()); // check if list is empty

        colors.trimToSize();//trim

        colors.ensureCapacity(1000);//increase capacity of the list

        colors.set(1,"new color"); // replace second element

        for(int i = 0; i< colors.size(); i++) System.out.println(colors.get(i));




















    }
}
