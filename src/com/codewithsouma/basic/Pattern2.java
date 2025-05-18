package com.codewithsouma.basic;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int N = sc.nextInt();

        System.out.println("Printing the pattern type1: ");
        for(int i = N; i>=1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print(j+" ");

            System.out.println();
        }

        System.out.println("Printing the pattern type2: ");
        for(int i = N; i>=1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print(i+" ");

            System.out.println();
        }

        System.out.println("Printing the pattern type3: ");
        for(int i = N; i>=1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print(j % 2+" ");

            System.out.println();
        }

        System.out.println("Printing the pattern type4: ");
        for(int i = N; i>=1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print((char)(64 + j)+" ");

            System.out.println();
        }

        System.out.println("Printing the pattern type5: ");
        for(int i = N; i>=1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        System.out.println("Printing the pattern type6: ");
        for(int i = N; i>=1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print(i+" ");

            System.out.println();
        }

        System.out.println("Printing the pattern type7: ");
        for(int i = N; i>=1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print(i%2+" ");

            System.out.println();
        }

        System.out.println("Printing the pattern type8: ");
        for(int i = N; i>=1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print((char) (64 + i)+" ");

            System.out.println();
        }

        System.out.println("Printing the pattern type9: ");
        for(int i = N; i>=1; i--){
            for(int j = 1; j <= i; j++)
                System.out.print("# ");

            System.out.println();
        }
    }
}
