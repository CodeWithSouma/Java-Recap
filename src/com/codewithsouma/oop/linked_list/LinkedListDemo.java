package com.codewithsouma.oop.linked_list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3,300);
        list.addFirst(100);
        list.addLast(400);
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println("First element: "+list.getFirst());
        System.out.println("Last element: "+list.getLast());
        for (int ele : list) System.out.println(ele);
        System.out.println("Size: "+list.size());
        System.out.println(list);
    }
}
