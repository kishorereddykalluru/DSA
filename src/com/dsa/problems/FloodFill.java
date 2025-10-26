package com.dsa.problems;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

    public static void main(String[] args) {

        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] result = floodFill1(image, 1, 1,2);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] floodFill(int[][] image, int sr , int sc, int color) {

        int m = image.length;
        int n = image[0].length;

        image[sr][sc] = color;

        Queue<Integer[]> floodFill = new LinkedList<>();

        floodFill.add(new Integer[]{sr, sc});

        int[][] directions = {{0,-1}, {0,1}, {-1,0}, {1,0}};

        while(!floodFill.isEmpty()) {
            Integer[] pop = floodFill.remove();
            int i = pop[0];
            int j = pop[1];
            for (int[] direction : directions) {
                int x = i + direction[0];
                int y = j + direction[1];
                if (isSafe(x, y, m, n) && image[x][y] == 1) {
                    image[x][y] = 2;
                    floodFill.add(new Integer[]{x, y});
                }
            }
        }
        return image;
    }

    private static boolean isSafe(int x, int y, int m, int n) {
        return x >= 0  && y >= 0 && x < m && y < n;
    }

    private static void floodFill1(int[][] image, int sr , int sc, int oldColor, int color) {

        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor){
            return;
        }

        image[sr][sc] = color;

        floodFill1(image, sr-1, sc, oldColor, color);
        floodFill1(image, sr+1, sc, oldColor, color);
        floodFill1(image, sr, sc-1, oldColor, color);
        floodFill1(image, sr, sc+1, oldColor, color);
    }
    private static int[][] floodFill1(int[][] image, int sr , int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }

        floodFill1(image, sr, sc, image[sr][sc], color);
        return image;
    }
}
