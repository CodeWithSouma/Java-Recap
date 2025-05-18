package com.codewithsouma.basic;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int number){
        if(number == 0) return 1;
        return number * factorial(number -1);
    }
    public static void main(String[] args){
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number < 0) {
            System.out.println("Invalid Input.");
            return;
        }

        System.out.println("Factorial: "+factorial(number));

        /*for(int i = 1; i<=number; i++)
            factorial *= i;

        System.out.println("Factorial of "+number+" : "+factorial);*/

    }
}
