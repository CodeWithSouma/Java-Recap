package com.codewithsouma.oop;

public class CallByReference {
    public String name;

    static void change(CallByReference object){
        object.name = "Soumadip";
    }
}
