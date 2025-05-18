package com.codewithsouma.oop;

public class Teacher {
     String name;
     String gender;
     long phone;

     Teacher() {
         System.out.println("Default Constructor");
     }

     Teacher(String name, String gender, long phone){
         System.out.println("Parameterised constructor");
         this.name = name;
         this.gender = gender;
         this.phone = phone;
     }

     public void displayInformation(){
         System.out.println("Name: "+name);
         System.out.println("Gender: "+gender);
         System.out.println("Phone: "+phone);
         System.out.println();
     }

    public void setInformation(String name, String gender, long phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }
}
