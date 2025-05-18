package com.codewithsouma.basic;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        System.out.println("Sum: "+ (number1 + number2));
        System.out.println("Sub: "+ (number1 - number2));
        System.out.println("Multiple: "+ (number1 * number2));
        System.out.println("Division: "+(number1 / number2));
        System.out.println("Remainder: "+ (number1 % number2));
    }
}
