package com.codewithsouma;

import java.util.Arrays;

public class StringDemoE1 {
    public static void main(String[] args) {
        String s1 = "Anisul Islam";
        String s2 = new String("soumadip Dey");
        String s3 = new String("Soumadip Dey");
        char [] str = {'a', 'b', 'u', 'l'};

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(str);
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s2.contains(s3));
        System.out.println(s1.isEmpty());

        String firstName = "Soumadip";
        String lastName = "Dey";
        String fullName = firstName.toUpperCase() + " " + lastName.toUpperCase();
        System.out.println(fullName);
        System.out.println(fullName.startsWith("SOU"));
        System.out.println(fullName.codePointAt(0));
        System.out.println(fullName.indexOf('D'));
        System.out.println(fullName.lastIndexOf('D'));

        fullName = firstName.replace('S','p');
        System.out.println(fullName);

        String s = "This is my country";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

    }
}
