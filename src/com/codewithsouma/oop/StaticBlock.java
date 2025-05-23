package com.codewithsouma.oop;

public class StaticBlock {
    static String name;
    static int age;

    static {
        name = "Soumadip Dey";
        age = 20;
    }

    static void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
