package com.codewithsouma.oop.polymorphism;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.display();

        Teacher teacher = new Teacher();
        teacher.display();

        //dynamic methods dispatch: Supper class reference point to subclass object and called overridden
        //methods then it will take subclass implementation it is called dynamic method dispatch
        Person person1 = new Teacher();
        person1.display();

        Shape shape = new Rectangle(20, 5);
        System.out.println(shape.area());

        shape = new Triangle(20, 10);
        System.out.println(shape.area());
    }
}
