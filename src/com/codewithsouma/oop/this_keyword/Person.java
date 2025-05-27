package com.codewithsouma.oop.this_keyword;

public class Person {
    private String name;
    private int age;
    private String phone;

    Person(String name, int age, String phone){
        this(name, age);
        this.phone = phone;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
    }
}
