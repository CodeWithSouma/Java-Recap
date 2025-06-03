package com.codewithsouma.oop.linked_list;

public class Student {
    String name;
    String className;
    int id;

    public Student(String name, String className, int id) {
        this.name = name;
        this.className = className;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", id=" + id +
                '}';
    }
}
