package com.codewithsouma.oop.super_keyword;

public class Child extends Parent{
    int x = 20;
    public void display(){
        System.out.println(x); // it will print 20
        System.out.println(super.x); // it will print 30
    }
}
