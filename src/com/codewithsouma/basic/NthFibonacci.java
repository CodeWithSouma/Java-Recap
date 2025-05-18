package com.codewithsouma.basic;

import java.util.Scanner;

public class NthFibonacci {
    public static int fibonacci(int N){
        if(N == 1) return 0;
        if(N == 2) return 1;

        //Nth fibonacci number = (n-1) + (n-2)
        return fibonacci(N - 1) + fibonacci(N - 2 );
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a the value of N: ");
        int N = sc.nextInt();
        System.out.println("Nth Fibonacci number: "+fibonacci(N));

    }
}
