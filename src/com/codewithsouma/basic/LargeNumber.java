package com.codewithsouma.basic;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if(number1 == number2) {
            System.out.println("Numbers are equal");
            return;
        }
        int largeNumber = (number1 > number2) ? number1 : number2;
        System.out.println("Large Number: "+ largeNumber);
    }
}
