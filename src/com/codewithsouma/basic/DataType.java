package com.codewithsouma.basic;

public class DataType {
    public static void main(String[] args){
        int i = 10;
        float f = 10.5f;
        double d = 123142.4;
        long l = 1231224L;
        char ch = 'A';
        byte byt = 10;
        short sh = 100;
        boolean bool = true;

        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(ch);
        System.out.println(byt);
        System.out.println(sh);
        System.out.println(bool);

        System.out.println("\nPrinting the variable using format specifier: ");
        System.out.printf("%d\n",i);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.2f\n", d);
        System.out.printf("%d\n", l);
        System.out.printf("%c\n", ch);
        System.out.printf("%b\n", byt);
        System.out.printf("%d\n", sh);
        System.out.printf("%B\n", bool);


    }
}
