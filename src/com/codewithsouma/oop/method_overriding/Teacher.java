package com.codewithsouma.oop.method_overriding;

public class Teacher extends Person{
    private String qualification;
    Teacher(String name, int age, String qualification){
        super(name, age);
        this.qualification = qualification;
    }

    /**
     * We can not override static method and final method
     * we can not override main method because it is a static method
     */
    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Qualification: "+qualification);
    }
}
