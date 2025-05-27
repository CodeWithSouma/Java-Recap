package com.codewithsouma.oop.final_keyword;

public class Test {
    public static void main(String[] args) {
        University university = new University(37000);
        //university.name = "LU";
        //university.fees = 45000;
        university.display();

        Student student = new Student(4500);
        student.display();
    }
}
