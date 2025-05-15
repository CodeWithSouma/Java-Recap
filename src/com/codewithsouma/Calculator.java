package com.codewithsouma;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Sum of "+ number1 + " and "+number2+" = "+(number1 + number2));
                break;
            case 2:
                System.out.println("Subtraction of "+ number1 + " and "+number2+" = "+(number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication of "+ number1 + " and "+number2+" = "+(number1 * number2));
                break;
            case 4:
                System.out.println("Division of "+ number1 + " and "+number2+" = "+((double) number1 / number2));
                break;

        }


    }
}
