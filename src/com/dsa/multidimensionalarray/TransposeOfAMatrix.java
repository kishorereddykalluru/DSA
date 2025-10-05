package com.dsa.multidimensionalarray;

/**
 * Problem Statement
 *
 * Convert matrix row and columns into columns and rows - Transpose matrix
 */

public class TransposeOfAMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{15,16,-2,18}};

        int[][] transposeMatrix = transposeOfMatrix(matrix);
        TransposeOfAMatrix transposeOfAMatrix = new TransposeOfAMatrix();
        transposeOfAMatrix.printMatrix(transposeMatrix);
    }

    private static int[][] transposeOfMatrix(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++){
                newMatrix[i][j] = matrix[j][i];
            }
        }

        return newMatrix;
    }



    private void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}