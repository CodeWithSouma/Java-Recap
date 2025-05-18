package com.codewithsouma.basic;

public class UnaryOperator {
    public static void main(String[] args ){
        int a = 10;
        int result = +a;
        System.out.println(result);

        result = -a;
        System.out.println(result);

        result = a++;
        System.out.println(result);
        System.out.println(a);

        result = a--;
        System.out.println(result);
        System.out.println(a);

        result = ++a;
        System.out.println(result);
        System.out.println(a);

        result = --a;
        System.out.println(result);
        System.out.println(a);

    }
}
