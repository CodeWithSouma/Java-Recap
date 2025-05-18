package com.codewithsouma.basic;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.print("Enter day number for (1 - 7) : ");
        int dayNumber = sc.nextInt();
        System.out.println(weekdays[dayNumber - 1]);

    }
}
