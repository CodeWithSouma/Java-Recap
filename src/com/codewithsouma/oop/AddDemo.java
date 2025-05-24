package com.codewithsouma.oop;

public class AddDemo {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int ...numbers){
        int sum = 0;
        for(int num : numbers) sum += num;
        return sum;
    }
}
