package com.codewithsouma.oop.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter number 1: ");
                num1 = scanner.nextInt();
                System.out.print("Enter number 2: ");
                num2 = scanner.nextInt();

                // This might throw ArithmeticException
                System.out.println("Result: " + num1 / num2);
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.next(); // Clear the invalid token
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero. Please try again.");
            } finally {
                System.out.println();
            }
        }

    }
}
