package com.dsa.multidimensionalarray;

public class FloodFill {

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};

        FloodFill floodFill = new FloodFill();
        int[][] result = floodFill.floodFill(image, 1, 1, 2);

        floodFill.printMatrix(result);

    }

    private int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if(image[sr][sc] == newColor) return image;

        floodFill(image, sr, sc, 1, newColor);

        return image;
    }

    private void floodFill(int[][] image, int sr, int sc, int currentColor, int newColor)  {
        if(sc < 0 || sr < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != currentColor)
            return;

        image[sr][sc] = newColor;

        floodFill(image, sr + 1, sc, currentColor, newColor);
        floodFill(image, sr - 1, sc, currentColor, newColor);
        floodFill(image, sr, sc + 1, currentColor, newColor);
        floodFill(image, sr, sc - 1, currentColor, newColor);
    }

    private void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
