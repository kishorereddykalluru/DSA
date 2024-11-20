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
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int row = mat.length;
        int col = mat[0].length;

        int[][] resultMatrix = new int[r][c];

        if(col * row != r * c) {
            return mat;
        }

        int result_rows = 0;
        int result_cols = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                resultMatrix[result_rows][result_cols] = mat[i][j];
                result_cols++;
                if(result_cols == c) {
                    result_cols = 0;
                    result_rows++;
                }
            }
        }
        return resultMatrix;
    }
}
