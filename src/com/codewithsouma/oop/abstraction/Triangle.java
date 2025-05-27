package com.codewithsouma.oop.abstraction;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return .5 * base * height;
    }
}
