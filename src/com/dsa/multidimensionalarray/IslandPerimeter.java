package com.dsa.multidimensionalarray;

public class IslandPerimeter {

    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0,}};
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        int i = islandPerimeter.islandPerimeter1(grid);
        System.out.println(i);
    }

    public int islandPerimeter1(int[][] grid) {

        int result = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    result += 4;

                    if (i > 0 && grid[i - 1][j] == 1)
                        result -= 2;

                    if (j > 0 && grid[i][j - 1] == 1)
                        result -= 2;
                }
            }
        }
        return result;
    }
}
