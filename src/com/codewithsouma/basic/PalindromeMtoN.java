package com.codewithsouma.basic;

import java.util.Scanner;

public class PalindromeMtoN {
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverseNumber = 0;

        while(number != 0){
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }

        return (reverseNumber == originalNumber);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int M = sc.nextInt();
        System.out.print("Enter the final range: ");
        int N = sc.nextInt();

        int count = 0;
        System.out.print("Printing all palindrome number between "+M+" to "+N+" = ");
        for(int i = M; i <= N; i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
                count++;
            }
        }

        System.out.println("\nTotal palindrome number: "+count);

    }
}
