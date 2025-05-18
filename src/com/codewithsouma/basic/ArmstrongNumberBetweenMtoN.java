package com.codewithsouma.basic;

import java.util.Scanner;

public class ArmstrongNumberBetweenMtoN {
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        while(number != 0){
            sum += Math.pow(number%10, 3); // sum = sum + digit^3
            number /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int M = sc.nextInt();
        System.out.print("Enter the ending range: ");
        int N = sc.nextInt();
        int count = 0;
        System.out.print("Armstrong number between "+M+" to "+N+" : ");
        for(int i = M; i<= N; i++){
            if(isArmstrong(i)){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.print("\nTotal Armstrong number between "+M+" to "+N+" = "+count);

    }
}
