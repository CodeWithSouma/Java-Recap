package com.codewithsouma.basic;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you love java: ");
        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch == 'y')
            System.out.println("You are a java lover.");
        else if(ch == 'N' || ch == 'n')
            System.out.println("You are not a java lover.");
        else
            System.out.println("Invalid Input.");
    }
}
