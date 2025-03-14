package com.codewithsouma;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        System.out.println("Bitwise AND: " + (number1 & number2) );
        System.out.println("Bitwise OR: " + (number1 | number2));
        System.out.println("Bitwise EXOR: " +(number1 ^ number2));

    }
}
