package com.codewithsouma.oop.abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser mobileUser = new Rahim();
        mobileUser.sendMessage();
        mobileUser = new Karim();
        mobileUser.sendMessage();
        mobileUser.call();

        Shape shape = new Rectangle(10, 20);
        System.out.println(shape.area());
        shape = new Triangle(20, 30);
        System.out.println(shape.area());
        shape = new Circle(3);
        System.out.println(shape.area());
    }
}
