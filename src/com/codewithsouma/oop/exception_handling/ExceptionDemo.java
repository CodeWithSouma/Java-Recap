package com.codewithsouma.oop.exception_handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int num = 10;
         try{
             System.out.println(num / 0);
         }catch (ArithmeticException e){
             System.out.println("You can not divide by zero. : "+e);
         }finally {
             System.out.println("Programme complete");
         }
    }
}
