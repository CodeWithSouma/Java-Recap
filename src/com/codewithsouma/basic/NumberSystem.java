package com.codewithsouma.basic;

public class NumberSystem {
    public static void main(String[] args) {
        String binary = "1010";
        Integer dec = Integer.parseInt(binary, 2);
        System.out.println(dec);
        String n = "101";
        int n2 = Integer.parseInt(n,2);
        System.out.println(n2);
        String oct = "675";
        int d = Integer.parseInt(oct, 8);
        System.out.println(d);
        String hex = "A";
        int i = Integer.parseInt(hex, 16);
        System.out.println(i);

        int num = 12;
        String bin = Integer.toBinaryString(num);
        System.out.println(bin);
        String oct1 = Integer.toOctalString(num);
        System.out.println(oct1);
        String hex1 = Integer.toHexString(num);
        System.out.println(hex1);
    }
}
