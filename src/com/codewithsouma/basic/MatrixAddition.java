package com.codewithsouma.basic;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] result = new int[2][3];

        System.out.println("Taking input for matrix A");
        for( int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.print("Enter input for A["+i+"]["+j+"] = ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Taking input for matrix B");
        for( int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.print("Enter input for A["+i+"]["+j+"] = ");
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing A matrix: ");
        for (int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Printing B matrix: ");
        for (int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

        //adding two matrix
        System.out.println();
        System.out.println("Printing the result matrix: ");
        for( int i = 0; i<2; i++ ){
            for(int j = 0; j<3; j++){
                result[i][j] = A[i][j] + B[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
