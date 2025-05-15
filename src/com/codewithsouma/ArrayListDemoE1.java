package com.codewithsouma;

import java.util.*;

public class ArrayListDemoE1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Size = "+arrayList.size());
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(3,400);
        for (int ele : arrayList) System.out.println(ele);
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) System.out.println(it.next());

        System.out.println(arrayList.contains(400));
        System.out.println(arrayList.indexOf(400));
        arrayList.set(3,500);
        System.out.println(arrayList);
        arrayList.remove(Integer.valueOf(400));
        System.out.println(arrayList.get(0));
        arrayList.removeAll(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        boolean equals = arrayList2.equals(arrayList3);
        System.out.println(equals);
        arrayList2.addAll(arrayList3);
        System.out.println(arrayList2);

        Collections.sort(arrayList2, Collections.reverseOrder());
        System.out.println(arrayList2);

        int []arr = {10, 5, 5, 6,30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
