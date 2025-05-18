package com.codewithsouma.basic;

import java.util.Scanner;

public class Assigment4 {
    public static void main(String[] args){
        final int MONTHS_IN_THE_YEAR = 12;
        try(Scanner sc = new Scanner(System.in)){
            int phonePrice = 1800;//p
            System.out.print("Number of installments? ");
            int numberOfInstallment = sc.nextInt();
            System.out.print("Enter interest rate: ");
            float interestRate = sc.nextInt();

            float monthlyInterest = interestRate / MONTHS_IN_THE_YEAR / 100;

            double emi = phonePrice * monthlyInterest * (
                    (  Math.pow((1 + monthlyInterest), numberOfInstallment))
                            / (Math.pow((1 + monthlyInterest), numberOfInstallment) - 1)
                    );


            double installmentPerMonth = (double) phonePrice / numberOfInstallment;
            System.out.println("Monthly installment Amount: "+emi + " euros");
        }
    }
}
