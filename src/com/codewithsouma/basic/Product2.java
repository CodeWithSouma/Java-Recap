package com.codewithsouma.basic;

import java.util.Scanner;

public class Product2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter Price: ");
        String price = sc.nextLine();
        System.out.print("Enter description: ");
        String description = sc.nextLine();
        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.println(id);
        System.out.println(title);
        System.out.println(price);
        System.out.println(description);
        System.out.println(category);
    }
}
