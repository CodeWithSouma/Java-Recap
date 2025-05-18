package com.codewithsouma.basic;

import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius){
        return (((double) 9 / 5 * celsius) + 32);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return ((double)5/9 * (fahrenheit - 32));
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        label:
        while (true){
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter celsius value: ");
                    double celsius = sc.nextDouble();
                    System.out.printf("Fahrenheit: %.2f\n" , celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.print("Enter fahrenheit value: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.printf("Celsius: %.2f\n" , fahrenheitToCelsius(fahrenheit));
                    break;
                case 3:
                    break label;
                default:
                    System.out.println("Invalid Input");

            }
        }
    }
}
