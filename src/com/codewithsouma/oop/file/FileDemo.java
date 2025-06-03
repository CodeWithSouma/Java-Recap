package com.codewithsouma.oop.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir();
        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.getName());
        /*if (dir.delete()) {
            System.out.println(dir.getName()+" Directory has deleted.");
        }*/

        File file1 = new File("Person/Student.txt");
        File file2 = new File("Person/Teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File has created successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }

        //file1.delete();

//        if (file1.exists())
//            System.out.println("File1 is exists");



    }
}
