package com.dsa.multidimensionalarray;

public class VerticalFlipMatrix {

    public static void main(String[] args) {
        DisplayMatrix displayMatrix = new DisplayMatrix();
        int[][] matrix= {{1,2}, {3,4}};
        int[][] resultMatrix = verticalFlip(matrix);
        inplaceVerticalFlip(matrix);
        displayMatrix.showElements(resultMatrix);
        System.out.println("----------------");
        displayMatrix.showElements(matrix);
    }

    private static void inplaceVerticalFlip(int[][] matrix) {

        for(int i = 0; i < matrix.length/2; i++) {
                swap(matrix[i], matrix[matrix.length - 1 - i]);
        }
    }

    private static void swap(int[] matrix1, int[] matrix2) {
        for(int j = 0; j < matrix1.length; j++) {
            int temp = matrix1[j];
            matrix1[j] = matrix2[j];
            matrix2[j] = temp;
        }
    }

    private static int[][] verticalFlip(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0 ; j < matrix[i].length; j++) {
                resultMatrix[i][j] = matrix[matrix.length - 1 - i][j];
            }
        }
        return resultMatrix;
    }
}
