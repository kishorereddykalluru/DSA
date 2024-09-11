package com.dsa.multidimensionalarray;

public class RowAndColumZeroMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1, 1, 1, 1},
                          {1, 0, 0, 1},
                          {0, 1, 0, 1},
                          {1, 1, 1, 1}};

        rowAndColumnZeroMatrixBruteForce(matrix);
        rowAndColumnZeroMatrixOptimized(matrix);
        rowAndColumnZeroMatrixSpaceOptimized(matrix);

    }

    private static void rowAndColumnZeroMatrixSpaceOptimized(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int col0 = 1;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if(j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }

        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < columns; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)  {
                    matrix[i][j] = 0;
                }
            }
        }

        if(col0 == 0) {
            for(int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

        printMatrix(matrix, rows, columns);

    }

    private static void rowAndColumnZeroMatrixOptimized(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] rowCount = new int[rows];
        int[] columnCount = new int[columns];

        int k = 0;
        int l = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    rowCount[k++] = i;
                    columnCount[l++] = j;
                }
            }

        }

        for( int m = 0; m < k; m++) {
            for(int i = 0; i < columns; i++) {
                matrix[rowCount[m]][i] = 0;
            }
        }
        System.out.println();
        for( int n = 0; n < k; n++) {
            for(int i = 0; i < columns; i++) {
                matrix[i][columnCount[n]] = 0;
            }
        }

        printMatrix(matrix, rows, columns);
    }

    private static void printMatrix(int[][] matrix, int rows, int columns) {
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

    private static void rowAndColumnZeroMatrixBruteForce(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0 ; j < columns; j++) {
                if(matrix[i][j] == 0) {
                    markRow(matrix, i, rows);
                    markColumn(matrix, j, columns);
                }
            }
        }

        printMatrix(matrix, rows, columns);
    }

    private static void markColumn(int[][] m, int column, int columns) {
        for(int i = 0 ; i < columns; i++) {
            if(m[i][column] == 1)
                m[i][column] = -1;
        }
    }

    private static void markRow(int[][] m, int row, int rows) {
        for(int i = 0 ; i < rows; i++) {
            if(m[row][i] == 1)
                m[row][i] = -1;
        }
    }
}
