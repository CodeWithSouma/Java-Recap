package com.codewithsouma;

public class BreakAndContinue {
    public static void main(String[] args){
        for(int i = 1; i<=100; i++){
            System.out.println(i);
            if(i == 10) break;
        }

        System.out.println();
        for(int i = 1; i<=10; i++){
            if(i%2 == 0) continue;;
            System.out.println(i);
        }
    }
}
