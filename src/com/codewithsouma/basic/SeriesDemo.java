package com.codewithsouma.basic;

import java.util.Scanner;

public class SeriesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=N; i++){
            System.out.print(i);
            if(i != N) System.out.print(" + ");
            if( i == N) System.out.print(" = ");
            sum += i;
        }

        System.out.println(sum);

        sum = 0;
        for(int i = 1; i<=N; i++){
            if(i % 2 != 0){
                System.out.print(i);
                sum += i;
                if (i+1 == N || i == N)
                    System.out.print(" = ");
                else
                    System.out.print(" + ");

            }
        }

        System.out.println(sum);


        sum = 0;
        for(int i = 1; i<= N; i++){
            sum += i * 5;
            System.out.print(i+"."+5);
            if(i != N) System.out.print(" + ");
            else System.out.print(" = ");
        }

        System.out.println(sum);

        sum = 0;
        for(int i = 1; i<= N; i++){
            sum += Math.pow(i,2);
            System.out.print(i+"^2");
            if(i != N) System.out.print(" + ");
            else System.out.print(" = ");
        }
        System.out.println(sum);


    }
}
