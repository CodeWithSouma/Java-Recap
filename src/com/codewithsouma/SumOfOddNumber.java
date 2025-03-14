package com.codewithsouma;

import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;

        for(int i = m; i <= n; i++)
            if(i % 2 != 0) sum += i;

        System.out.println("Sum of odd number between "+m +" to "+n+" = "+sum);

    }
}
