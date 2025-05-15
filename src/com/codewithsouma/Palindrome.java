package com.codewithsouma;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int reverseNumber = 0;
        while(number != 0){
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }

        if( originalNumber == reverseNumber)
            System.out.println("Palindrome.");
        else System.out.println("Not Palindrome.");
    }
}
