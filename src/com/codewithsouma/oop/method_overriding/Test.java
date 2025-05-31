package com.codewithsouma.oop.method_overriding;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Soumadip Dey", 25, "Btech in CSE");
        teacher.displayInformation();

        //down casting : java does not supports
        /*Teacher teacher1 = (Teacher) new Person("Souma", 25);
        teacher1.displayInformation();*/

        Person person = new Person("Soumadip", 25){
            @Override
            public void displayInformation(){
                System.out.println("Anonymous class");
            }
        };

        person.displayInformation();
    }
}
