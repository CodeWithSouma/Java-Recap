package com.codewithsouma.basic;

public class EqualsMethod {
    public static void main(String[] args) {
        String password1 = "Password123";
        String password2 = "Password123";
        String password3 = new String("Password123");
        String password4 = new String("Password123");

        System.out.println(password1 == password2);// true
        System.out.println(password1.equals(password2));//true
        System.out.println(password3 == password4);//false
        System.out.println(password3.equals(password4));//true

    }
}
