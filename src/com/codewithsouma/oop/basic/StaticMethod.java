package com.codewithsouma.oop.basic;

public class StaticMethod {
    void display1(){
        System.out.println("I am non static method");
    }

    static void display2(){
        //display1();//non static method cannot be use from static method
        //like that way we can call
        /*StaticMethod obj = new StaticMethod();
        obj.display1();*/
        System.out.println("I am static method");
    }
}
