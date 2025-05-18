package com.codewithsouma.basic;

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int result = 1;
        for(int i = 1; i<=N; i++){
            result *= i;
            System.out.print(i);
            if(i == N) System.out.print(" = ");
            else System.out.print(" * ");

        }

        System.out.println(result);


        result = 1;
        for(int i = 1; i<=N; i++){
            if(i % 2 != 0){
                result *= i;
                System.out.print(i);
                if(i + 1 == N || i == N) System.out.print(" = ");
                else System.out.print(" * ");
            }
        }

        System.out.println(result);

    }
}
