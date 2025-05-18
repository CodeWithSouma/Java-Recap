package com.codewithsouma.basic;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);

        System.out.println(arrayList.contains(20));
        System.out.println(arrayList.indexOf(20));
        arrayList.set(2, 300);
        System.out.println(arrayList);
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.equals(arrayList));

        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList.isEmpty());

    }
}
