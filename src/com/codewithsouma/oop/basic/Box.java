package com.codewithsouma.oop.basic;

public class Box {
    private double height;
    private double width;
    private double depth;

    public Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double displayVolume(){
        return (height * width * depth);
    }

}
