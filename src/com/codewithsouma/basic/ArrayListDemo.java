package com.codewithsouma.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(0,5);

        arrayList.remove(Integer.valueOf(50));
        arrayList.remove(arrayList.indexOf(40));
        arrayList.remove(0);

        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println();
        for (var ele : arrayList) System.out.println(ele);

        System.out.println();
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

        System.out.println("After removing all printing the array list: ");
        arrayList.removeAll(arrayList);
        for (int ele : arrayList) System.out.println(ele);

        System.out.println(arrayList.isEmpty());


    }
}
