package com.codewithsouma.oop.file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Formatter formatter = new Formatter("Person/Student.txt");
            System.out.print("Enter how many student record you want to insert: ");
            int cout = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i<cout; i++){
                System.out.print("Enter Student ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                formatter.format("%s %s\n", id, name);
            }

//            formatter.format("%s %s\n", "101", "Soumadip Dey");
//            formatter.format("%s %s\n", "102", "Soumik Nandi");
//            formatter.format("%s %s\n", "103", "Priyanka Dey");
            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
