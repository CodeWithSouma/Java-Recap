package com.codewithsouma.oop.basic;

public class Overload {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int add(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }

    public void add() {
        System.out.println("nothing to add");
    }
}
