package com.codewithsouma.oop.basic;

public class CallByReference {
    public String name;

    static void change(CallByReference object){
        object.name = "Soumadip";
    }
}
