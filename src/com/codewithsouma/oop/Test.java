package com.codewithsouma.oop;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
//        teacher.name = "Soumadip Dey";
//        teacher.gender = "Male";
//        teacher.phone = 8768454982L;
        teacher.setInformation("Soumadip Dey", "Male", 8768454982L);

//        System.out.println("Name: "+teacher.name);
//        System.out.println("Gender: "+teacher.gender);
//        System.out.println("Phone: "+teacher.phone);
        teacher.displayInformation();


        Teacher teacher2 = new Teacher();
//        teacher2.name = "Soumik Nandi";
//        teacher2.gender = "Male";
//        teacher2.phone = 7076922914L;

        teacher2.setInformation("Soumik Nandi", "Male", 7076922914L);
        teacher2.displayInformation();

//        System.out.println("\nName: "+teacher2.name);
//        System.out.println("Gender: "+teacher2.gender);
//        System.out.println("Phone: "+teacher2.phone);

    }
}
