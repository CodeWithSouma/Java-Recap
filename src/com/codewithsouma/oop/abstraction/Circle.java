package com.codewithsouma.oop.abstraction;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius,2);
    }
}
