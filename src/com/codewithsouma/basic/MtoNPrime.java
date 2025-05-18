package com.codewithsouma.basic;

import java.util.Scanner;

public class MtoNPrime {
    public static boolean isPrime(int number){
        if (number == 1 || number == 0) return false;
        for(int i = 2; i <= number / 2; i++)
            if( number % i == 0 ) return false;

        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting Number: ");
        int M = sc.nextInt();
        System.out.print("Enter ending Number: ");
        int N = sc.nextInt();

        System.out.print("Printing prime number between "+M+" to "+N+" : ");
        for(int i = M; i<= N; i++)
            if(isPrime(i)) System.out.print(i + " ");
    }
}

