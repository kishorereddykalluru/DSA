package com.dsa.multidimensionalarray;

public class RotateMatrix {
    public static void main(String[] args) {
        DisplayMatrix displayMatrix = new DisplayMatrix();
        int[][] matrix = {{1,2,3},{4,5,6}, {7,8,9}};
        displayMatrix.showElements(matrix);
        System.out.println("================");
        displayMatrix.showElements(rotateMatrix(matrix));
    }

    private static int[][] rotateMatrix(int[][] matrix) {

        int[][] resultMatrix = new int[matrix.length][matrix.length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                resultMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        return resultMatrix;
    }
}
