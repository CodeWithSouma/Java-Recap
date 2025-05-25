package com.codewithsouma.oop;

public class Engineer extends Person{
    private String qualification;
    Engineer(String name, int age, String qualification) {
        super(name, age);
        this.qualification = qualification;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Qualification: "+this.qualification);
    }
}
