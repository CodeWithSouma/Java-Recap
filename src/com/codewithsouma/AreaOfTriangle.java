package com.codewithsouma;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        float base = sc.nextFloat();
        System.out.print("Enter Height: ");
        float height = sc.nextFloat();

        float areaOfTriangle = 0.5F * base * height;
        System.out.println("Area of Triangle: "+areaOfTriangle);

    }
}
