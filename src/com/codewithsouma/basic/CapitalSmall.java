package com.codewithsouma.basic;

import java.util.Scanner;

public class CapitalSmall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z')
            System.out.println("This is a capital letter.");
        else if(ch >= 'a' && ch <= 'z' )
            System.out.println("This is a small letter.");

    }
}
