package com.codewithsouma.oop.basic;

public class Test {
    public static void main(String[] args) {
        /*Teacher teacher1 = new Teacher("Soumadip Dey", "Male", 8768454982L);
        Teacher teacher2 = new Teacher("Soumik Nandi", "Male", 7076922914L);
        Teacher teacher3 = new Teacher();*/

        //teacher1.setInformation("Soumadip Dey", "Male", 8768454982L);
        //teacher2.setInformation("Soumik Nandi", "Male", 7076922914L);

        /*teacher1.displayInformation();
        teacher2.displayInformation();
        teacher3.displayInformation();*/

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

        /*ReturningValue returningValue = new ReturningValue();
        int square = returningValue.square(5);
        System.out.println(square);*/

        /*Student student = new Student("Soumadip Dey", 25);
        System.out.println(student);*/

        /*StaticDemo obj = new StaticDemo();
        System.out.println(obj.universityName);
        System.out.println(StaticDemo.name);*/

       /* ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) students.add(new Student("Souma" + i, 25 + i));
        System.out.println(students);
        System.out.println(Student.totalStudent);*/

       /* StaticMethod obj = new StaticMethod();
        obj.display1();
        StaticMethod.display2();*/
        //StaticBlock.display();

        /*Box box1 = new Box(10, 10, 10);
        System.out.println("Volume of the Box1: " + box1.displayVolume());

        Box box2 = new Box(20, 30, 10);
        System.out.println("Volume of the Box2: " +box2.displayVolume());*/

        /*Overload overload = new Overload();
        int sum = overload.add(10, 20, 30);
        System.out.println(sum);*/

        /*CallByValue value = new CallByValue();
        int x = 5;
        System.out.println(x);
        value.change(x);// actual parameter
        System.out.println(x);

        CallByReference obj = new CallByReference();
        obj.name = "Priyanka";
        System.out.println(obj.name);

        CallByReference.change(obj);
        System.out.println(obj.name);*/

       /* AddDemo obj = new AddDemo();
        int add = obj.add(10, 20);
        System.out.println(add);
        add = obj.add(10, 20, 30);
        System.out.println(add);*/

        /*RecursionDemo recursionDemo = new RecursionDemo();
        System.out.println(recursionDemo.factorial(5));*/

        /*Person person = new Person("Soumadip", 25);
        person.setName("Priyanka");
        person.display();*/

        Engineer engineer = new Engineer("Soumadip Dey", 25, "Btech in CSE");
        engineer.display();

        if (engineer instanceof Person) System.out.println("Engineer is instance of Person");
    }
}
