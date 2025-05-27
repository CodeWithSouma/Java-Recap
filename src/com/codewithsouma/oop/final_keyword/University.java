package com.codewithsouma.oop.final_keyword;

public class University {
    final String name = "Burdwan University";
    final int fees;
    static final int num;

    static {
        System.out.println("Static block called");
        num = 20;
    }

    public University(int fees) {
        System.out.println("Constructor called");
        this.fees = fees;
    }

    final void display(){
        System.out.println("University name: "+name);
        System.out.println("Fees: "+fees);
        System.out.println(num);
    }

}
