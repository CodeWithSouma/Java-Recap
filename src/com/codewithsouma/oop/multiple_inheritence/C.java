package com.codewithsouma.oop.multiple_inheritence;

public class C implements A, B{
    @Override
    public void foo() {
        System.out.println("Hi, I am from C Class.");
    }
}
