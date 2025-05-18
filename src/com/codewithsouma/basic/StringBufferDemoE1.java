package com.codewithsouma.basic;

public class StringBufferDemoE1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Soumadip Dey");
        System.out.println(sb);
        sb.append("123");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 4);
        System.out.println(sb);


        String str = "Madam";
        StringBuffer sb1 = new StringBuffer(str);
        boolean equals = sb1.reverse().toString().equalsIgnoreCase(str);
        System.out.println(equals ? "palindrom" : "not palindrom" );

    }
}
