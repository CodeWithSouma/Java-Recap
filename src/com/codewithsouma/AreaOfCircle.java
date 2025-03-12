package com.codewithsouma;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = sc.nextFloat();
        float areaOfCircle = (float)(Math.PI * Math.pow(radius,2));
        System.out.println("Area of circle: "+areaOfCircle);
    }
}
