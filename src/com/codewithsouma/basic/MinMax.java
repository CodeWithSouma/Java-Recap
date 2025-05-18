package com.codewithsouma.basic;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        for(int i = 0; i<numbers.length; i++)
            numbers[i] = sc.nextInt();
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) max = number;
            if (number < min) min = number;
        }

        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);

    }
}
