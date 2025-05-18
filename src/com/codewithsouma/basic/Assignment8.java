package com.codewithsouma.basic;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you have completed master? ");
        char choice = sc.next().charAt(0);

        boolean completedMaster = false;
        if(choice == 'Y' || choice == 'y')
            completedMaster = true;
        else if(choice == 'N' || choice == 'n')
            completedMaster = false;
        else
            System.out.println("Invalid Input.");

        System.out.print("Are you fluent in English: ");
        choice = sc.next().charAt(0);

        boolean fluentInEnglish = false;
        if(choice == 'Y' || choice == 'y')
            fluentInEnglish = true;
        else if(choice == 'N' || choice == 'n')
            completedMaster = false;
        else
            System.out.println("Invalid Input.");

        if(completedMaster && fluentInEnglish)
            System.out.println("You are eligible.");
        else
            System.out.println("You are not eligible.");
    }
}
