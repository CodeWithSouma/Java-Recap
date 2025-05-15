package com.codewithsouma;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int first = 0;
        int second = 1;
        int fibo;

        System.out.print("Printing the fibonacci series: ");
        if(N == 1) System.out.print(first);
        else if(N == 2) System.out.print(first+" "+second);
        else {
            System.out.print(first+" "+second);
            for(int i = 3; i<=N; i++){
                fibo = first + second;
                System.out.print(" "+ fibo);
                first = second;
                second = fibo;
            }
        }
    }
}
