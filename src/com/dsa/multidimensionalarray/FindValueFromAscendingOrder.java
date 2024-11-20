package com.dsa.multidimensionalarray;

public class FindValueFromAscendingOrder {

    public static void main(String[] args) {
        int[][] matrix = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        System.out.println(findElement(matrix, 29));

    }

    private static boolean findElement(int[][] matrix, int element) {

        int i = 0;
        int j = matrix[0].length - 1;

        while(i < matrix.length && j >= 0) {
            if(matrix[i][j] == element) {
                return true;
            }

            if(matrix[i][j] > element) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }

}
