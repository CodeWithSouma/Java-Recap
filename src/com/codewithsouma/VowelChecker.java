package com.codewithsouma;

import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toUpperCase().charAt(0);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
