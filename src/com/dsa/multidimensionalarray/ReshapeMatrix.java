package com.dsa.multidimensionalarray;

public class ReshapeMatrix {

    public static void main(String[] args) {

        int[][] mat = {{1,2},{3,4}};
         int[][] resultMatrix = matrixReshape(mat, 4, 1);
        printMatrix(resultMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] matrix, int r, int c) {

        int[][] resultMatrix = new int[r][c];

        int rows = matrix.length;
        int cols = matrix[0].length;

        int new_row = 0;
        int new_col = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                resultMatrix[new_row][new_col] = matrix[i][j];
                new_col++;
                if(new_col == c) {
                    new_row++;
                    new_col = 0;
                }
            }
        }
        return resultMatrix;
    }
}
