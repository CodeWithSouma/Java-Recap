package com.codewithsouma;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        while(number != 0){
            sum = (int) (sum + Math.pow(number%10, 3));
            number /= 10;
        }

        if(sum == originalNumber) System.out.println("Armstrong Number.");
        else System.out.println("It is not Armstrong number.");
    }
}
