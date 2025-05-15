package com.codewithsouma;

import java.util.Scanner;

public class Matrix3 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];
        Scanner sc = new Scanner(System.in);

        int value = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<5; j++){
                matrix[i][j] = value;
                value++;
            }
        }

        System.out.println("Printing the matrix: ");
        for (int i =0 ; i<4; i++){
            for (int j=0; j<5; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
