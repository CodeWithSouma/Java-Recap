package com.codewithsouma;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int number){
        if (number == 1 || number == 0) return false;
        for(int i = 2; i <= number / 2; i++)
            if( number % i == 0 ) return false;

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(isPrime(number)) System.out.println("Prime Number.");
        else System.out.println("Number is not Prime.");

    }
}
