package com.codewithsouma.basic;

public class StringDemo2 {
    public static void main(String[] args) {
        String firstName = "Souma";
        String lastName = " Dey";

//        String fullName = firstName + lastName;
        String fullName = firstName.concat(lastName);

        System.out.println("Full name: "+fullName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.startsWith("Souma"));
        System.out.println(fullName.endsWith("dey"));

        String[] names = {"Souma", "Soumik", "Sumit"};
        for (String name : names) System.out.println(name);
    }
}
