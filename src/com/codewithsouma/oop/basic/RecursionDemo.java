package com.codewithsouma.oop.basic;

public class RecursionDemo {
    public int factorial(int n){
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
