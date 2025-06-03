package com.codewithsouma.basic;

import java.text.DecimalFormat;

public class DecimalNumberFormatDemo {
    public static void main(String[] args) {
        double x = 2.98745;
        DecimalFormat obj = new DecimalFormat("0.00");
        System.out.println("x = "+ obj.format(x));
        System.out.println("X = "+x);
        System.out.printf("%.2f",x);
    }
}
