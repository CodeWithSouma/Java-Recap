package com.codewithsouma.basic;

public class WrapperClass {
    public static void main(String[] args) {
        // primitive to object, object to primitive
        //autoboxing: primitive to object
        //unboxing: object to primitive

        int x = 30;
        Integer i = Integer.valueOf(x);
        int y = i.intValue();

        Integer z = x; // autoboxing
        int j = x;// unboxing
    }
}
