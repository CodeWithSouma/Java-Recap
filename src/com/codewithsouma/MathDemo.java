package com.codewithsouma;

public class MathDemo {
    public static void main(String[] args){
        int x = 20;
        int y = -10;
        System.out.println("Maximum: "+Math.max(x, y));
        System.out.println("Minimum: "+Math.min(x, y));
        System.out.println("Absolute value: "+Math.abs(y));

        int a = 3;
        int b = 2;
        System.out.println(Math.pow(a,b));

        int p = 144;
        System.out.println(Math.sqrt(p));

        float r = 3.45F;
        System.out.println(Math.round(r));

        System.out.println(Math.multiplyExact(12,-30));
        System.out.println(Math.PI);


    }
}
