package com.codewithsouma.basic;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        int n = sc.nextInt();
        System.out.print("Enter the final number: ");
        int m = sc.nextInt();

        for(int i = n; i<= m; i++)
            printMultiplicationTable(i);

    }

    private static void printMultiplicationTable(int N) {
        System.out.println("Printing the multiplication table of "+ N +" : ");
        for(int i = 1; i <= 10; i++)
            System.out.println(N + " x "+ i + " = " + (N * i));
        System.out.println();
    }
}
