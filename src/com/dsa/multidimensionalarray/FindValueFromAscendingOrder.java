package com.dsa.multidimensionalarray;

public class FindValueFromAscendingOrder {

    public static void main(String[] args) {
        int[][] matrix = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        System.out.println(findElement(matrix, 48));

    }

    public static String findElement(int[][] matrx, int value) {

        int i = 0;
        int j = matrx[0].length-1;

        while(i < matrx.length-1 && j >= 0) {

            if(matrx[i][j] == value)
                return "Element found at " + i +" and " + j;
            else if(matrx[i][j] > value) {
                j--;
            } else if(matrx[i][j] < value) {
                i++;
            }
        }

        return "Element not found";
    }

}
