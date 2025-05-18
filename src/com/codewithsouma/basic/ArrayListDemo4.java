package com.codewithsouma.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(5);
        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println(arrayList);


    }
}
