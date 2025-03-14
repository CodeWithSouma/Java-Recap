package com.codewithsouma;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Bengali language");
        System.out.println("2.English language");
        System.out.println("3.Hindi language");
        System.out.println("4.Urdu language");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("You have selected Bengali language.");
                break;
            case 2:
                System.out.println("You have selected English language.");
                break;
            case 3:
                System.out.println("You have selected Hindi language.");
                break;
            case 4:
                System.out.println("You have selected Urdu language.");
                break;
            default:
                System.out.println("Invalid Selection.");
                break;
        }
    }
}
