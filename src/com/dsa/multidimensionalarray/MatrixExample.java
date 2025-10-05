package com.dsa.multidimensionalarray;

public class MatrixExample {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3}, {4,5,6}};
        //System.out.println(matrix.length);
        //System.out.println(matrix[1].length);

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if(i+1 < matrix.length){
                    System.out.print(matrix[i+1][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
