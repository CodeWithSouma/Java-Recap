package com.codewithsouma.oop.hash_set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
        System.out.println("Size: "+set.size());
        set.remove(10);
        System.out.println(set);
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

    }
}
