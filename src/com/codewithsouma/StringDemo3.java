package com.codewithsouma;

public class StringDemo3 {
    public static void main(String[] args) {
        String message = "India is my country";
        System.out.println(message);

        char ch = message.charAt(3);
        System.out.println("Character at index 3 = "+ch);

        int ascii = message.codePointAt(2);
        System.out.println(ascii);

        int index = message.indexOf('d');
        System.out.println(index);

        int pos = message.lastIndexOf('i');
        System.out.println(pos);

        String message2 = "        India  is     my Country    ";
        System.out.println("message:"+message2.trim());

        System.out.println(message2.replace("India", "Bangladesh").trim());

        String[] parts = message2.trim().split(" ");
        for (String str : parts) System.out.println(str.trim());
    }
}
