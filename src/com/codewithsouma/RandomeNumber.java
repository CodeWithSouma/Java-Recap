package com.codewithsouma;

import java.util.Random;

public class RandomeNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(10);
        System.out.println(random);
    }
}
