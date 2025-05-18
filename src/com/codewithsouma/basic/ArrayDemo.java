package com.codewithsouma.basic;

public class ArrayDemo {
    public static void main(String[] args){
        int[] number = new int[5];
        int[] number2 = new int[15];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        int sum = 0;
        for(int i = 0; i<number.length; i++)
            sum += number[i];

        System.out.println(number[0]);
        System.out.println("Printing the size of the Array: "+number.length);
        System.out.println("Printing the sum = "+sum);

    }
}
