package com.codewithsouma;

import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args){
        int [] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        System.out.print("Enter 5 numbers: ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;
        System.out.print("Sum = "+sum);
        System.out.print("\nAverage = "+average);
    }
}
