package com.codewithsouma.oop;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Soumadip Dey", "Male", 8768454982L);
        Teacher teacher2 = new Teacher("Soumik Nandi", "Male", 7076922914L);
        Teacher teacher3 = new Teacher();

        //teacher1.setInformation("Soumadip Dey", "Male", 8768454982L);
        //teacher2.setInformation("Soumik Nandi", "Male", 7076922914L);

        teacher1.displayInformation();
        teacher2.displayInformation();
        teacher3.displayInformation();

//        teacher1.name = "Soumadip Dey";
//        teacher1.gender = "Male";
//        teacher1.phone = 8768454982L;

//        System.out.println("Name: "+teacher1.name);
//        System.out.println("Gender: "+teacher1.gender);
//        System.out.println("Phone: "+teacher1.phone);

//        teacher2.name = "Soumik Nandi";
//        teacher2.gender = "Male";
//        teacher2.phone = 7076922914L;


//        System.out.println("\nName: "+teacher2.name);
//        System.out.println("Gender: "+teacher2.gender);
//        System.out.println("Phone: "+teacher2.phone);

    }
}
