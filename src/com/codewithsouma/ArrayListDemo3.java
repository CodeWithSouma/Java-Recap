package com.codewithsouma;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);
        System.out.println("Array list1: "+arrayList1);

        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        System.out.println("Array list2: "+arrayList2);

        arrayList3.addAll(arrayList1);
        System.out.println("Array list3: "+arrayList3);

        System.out.println("Array list1 is equal to Array list3: "+arrayList1.equals(arrayList3));

     }
}
