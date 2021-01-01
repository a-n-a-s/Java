package com.company;

public class sumOfTwoMatrices {
    public static void main(String[] args) {
        int[][] matrix = {{1 , 2 , 3},{ 4 , 5, 6}};
        int[][] matrix2 = {{ 7 , 8 , 9 },{10 , 11 ,12}};
        int[][] result = {{0,0,0},{0,0,0}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                result[i][j] = matrix[i][j] + matrix2[i][j];

                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");

        }

    }
}
