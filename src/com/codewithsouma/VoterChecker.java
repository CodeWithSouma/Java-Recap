package com.codewithsouma;

import java.util.Scanner;

public class VoterChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        if(age >= 18)
            System.out.println("Valid voter.");
        else
            System.out.println("Invalid voter.");
    }
}
