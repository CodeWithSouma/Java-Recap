package com.codewithsouma.basic;

public class ForEachLoop {
    public static void main(String[] args){
        String[] names = new String[5];
        names[0] = "Souma";
        names[1] = "Bubai";
        names[2] = "Priya";
        names[3] = "Sanjoy";
        names[4] = "Nibadita";

        for(String name : names)
            System.out.println(name+" ");

    }
}
