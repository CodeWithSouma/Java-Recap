package com.codewithsouma.basic;

public class Matrix4 {
    public static void main(String[] args) {
        //int[][] matrix = new int[4][4];
        int[][] matrix = new int[4][];
        int value = 0;
        /*for (int i = 0; i<4; i++){
            for (int j =0; j<4; j++){
                if (i >= j) {
                    matrix[i][j] = value;
                    value++;
                }
            }
        }*/

        matrix[0] = new int[1];
        matrix[1] = new int[2];
        matrix[2] = new int[3];
        matrix[3] = new int[4];

        for (int i = 0; i<4; i++){
            for (int j =0; j<i+1; j++){
                    matrix[i][j] = value;
                    value++;
            }
        }


        System.out.println("Printing the matrix: ");
        for (int i = 0; i<4; i++){
            for (int j =0; j<4; j++){
                if (i >= j) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
