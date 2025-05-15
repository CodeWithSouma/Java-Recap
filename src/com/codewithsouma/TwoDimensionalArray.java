package com.codewithsouma;

public class TwoDimensionalArray {
    public static void main(String[] args){
        int[][] array = new int[2][3];
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;

        array[1][0] = 40;
        array[1][1] = 50;
        array[1][2] = 60;

        for(int i = 0; i<2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
