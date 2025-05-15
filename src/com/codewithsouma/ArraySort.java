package com.codewithsouma;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {1, 2,-3, 4, 6, 10, 5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        String[] names = {"Souma", "Soumik", "Sumit", "Arijit", " Prince"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
