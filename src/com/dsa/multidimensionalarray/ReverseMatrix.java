package com.dsa.multidimensionalarray;

public class ReverseMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] resultMatrix = new int[3][3];
        reverseMatrix(matrix, resultMatrix);
        DisplayMatrix displayMatrix = new DisplayMatrix();
        displayMatrix.showElements(resultMatrix);
    }

    private static void reverseMatrix(int[][] matrix, int[][] result) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[matrix.length - i - 1][matrix[i].length - j - 1];
            }
        }
    }
}
