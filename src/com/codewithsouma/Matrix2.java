package com.codewithsouma;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for the matrix: ");
        for(int i = 0; i<3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the value for matrix[" + i + "][" + j + "]= ");
                matrix[i][j] = sc.nextInt();
            }

        System.out.println("\nPrinting the matrix: ");
        for(int i = 0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
      /*  0 1 2
        0 1 2 3
        1 4 5 6
        2 7 8 9 */

        // calculating sum of the diagonal element, upper triangle, lower triangle
        int sum = 0;
        int sumOfUpperTriangle = 0;
        int sumOfLowerTriangle = 0;
        for( int i = 0; i<3; i++){
            for( int j = 0; j<3; j++){
                if(i == j) sum += matrix[i][j];
                if (j >= i) sumOfUpperTriangle += matrix[i][j];
                if (i >= j) sumOfLowerTriangle += matrix[i][j];
            }
        }

        System.out.println("Sum of diagonal element = "+ sum);
        System.out.println("Sum of upper triangle element = "+ sumOfUpperTriangle);
        System.out.println("Sum of lower triangle element = "+ sumOfLowerTriangle);


        // calculating sum of the upper triangle element
        /*sum = 0;
        for( int i = 0; i<3; i++){
            for( int j = 0; j<3; j++){
                if(j >= i) sum += matrix[i][j];
            }
        }*/



        // calculating sum of the lower triangle element
       /* sum = 0;
        for( int i = 0; i<3; i++){
            for( int j = 0; j<3; j++){
                if(i >= j) sum += matrix[i][j];
            }
        }*/

    }
}
