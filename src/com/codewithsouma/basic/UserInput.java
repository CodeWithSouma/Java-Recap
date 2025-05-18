package com.codewithsouma.basic;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("Enter a float: ");
        float floatNumber = sc.nextFloat();
        System.out.println("Enter a Double: ");
        double doubleNumber = sc.nextDouble();
        System.out.println("Enter a Character: ");
        char character = sc.next().trim().charAt(0);
        sc.nextLine();
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(number);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(character);
        System.out.println(str);

    }
}
