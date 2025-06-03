package com.codewithsouma.oop.linked_list;

import java.util.LinkedList;

public class StudentList {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Soumadip Dey", "12", 101));
        studentList.add(new Student("Soumik Dey", "12", 102));
        studentList.add(new Student("Sumit Roy", "12", 103));
        studentList.add(new Student("Amit Nandi", "12", 103));
        System.out.println(studentList);
    }
}
