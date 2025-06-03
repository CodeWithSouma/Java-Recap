package com.codewithsouma.oop.hash_map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Soumadip Dey");
        map.put(102, "Soumik Nandi");
        map.put(103, "Sumit Roy");

        System.out.println(map.get(103));

        for (String name : map.values()) System.out.println(name);
        for (int key : map.keySet()) System.out.println(key);
    }
}
