package com.codewithsouma;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args){
        final String USER_NAME = "Soumadip";
        final String PASSWORD = "12345";
        Scanner sc = new Scanner(System.in);
        String username;
        String password;

        while(true){
            System.out.print("Enter username: ");
            username = sc.nextLine().trim();
            System.out.print("Enter password: ");
            password = sc.nextLine().trim();
            if(USER_NAME.equals(username) && PASSWORD.equals(password)){
                System.out.print("Welcome to the system.");
                break;
            }
            else
                System.out.print("Username/Password is incorrect. Please try again.\n\n");
        }
    }
}
