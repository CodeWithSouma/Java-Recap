package com.codewithsouma.oop.basic;

public class Student {
    private String name;
    private int age;
    public static String universityName = "Burdwan University";
    public static int totalStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudent++;
    }

    public static void setUniversityName(String universityName) {
        Student.universityName = universityName;
    }

    @Override
    public String toString() {
        return "StaticDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", University='"+universityName+
                "'}";
    }


}
