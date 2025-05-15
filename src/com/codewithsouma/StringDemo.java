package com.codewithsouma;

public class StringDemo {
    public static void main(String[] args) {
        // sequence of character is called string

        //string literal
        String s1 = "soumadip";
        //string object
        String s2 = new String("Soumadip");
        //character array
        char[] s3 = {'a', 'n', 'i', 's'};

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Length of the string s1 is : "+s1.length());

        //when you use == operator then it will compare the reference it will not match the value so this will return false
        if(s1 == s2) System.out.println("Equals");
        else System.out.println("Not equals");

        String s4 = s1;// reference same so it will print true
        if(s1 == s4) System.out.println("Equals");
        else System.out.println("Not equals");

        //equals method will compare the value of the string
        if(s1.equals(s2)) System.out.println("Equals");
        else System.out.println("Not equals");

        //contains method also compare the content of these two string
        if (s1.contains(s2)) System.out.println("Equals");
        else System.out.println("Not equals");

        //equalsIgnoreCase will compare the content of two string
        if(s1.equalsIgnoreCase(s2)) System.out.println("Equals");
        else System.out.println("Not equals");


        System.out.println(s2.isEmpty());


    }
}
