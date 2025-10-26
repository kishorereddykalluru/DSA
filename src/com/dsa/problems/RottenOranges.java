package com.dsa.problems;


import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static void main(String[] args) {

        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }

    private static int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int freshOranges = 0;

        Queue<Integer[]> rottenOranges = new LinkedList<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 2) {
                    rottenOranges.add(new Integer[]{i, j});
                }
                if(grid[i][j] == 1) {
                    ++freshOranges;
                }
            }
        }

        int elapsedTime = 0;
        int[][] directions = {{0,-1}, {0,1}, {-1,0}, {1,0}};

        while(!rottenOranges.isEmpty()) {
            elapsedTime++;
            int size = rottenOranges.size();
            while(size-- > 0) {
                Integer[] remove = rottenOranges.remove();
                int i = remove[0];
                int j = remove[1];
                for(int[] direction: directions) {
                    int x = i + direction[0];
                    int y = j + direction[1];
                    if (isSafe(x, y, m, n) && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        rottenOranges.add(new Integer[]{x, y});
                        freshOranges--;
                    }
                }

            }
        }
        if(freshOranges > 0) return -1;
        return Math.max(0, elapsedTime - 1);
    }

    private static boolean isSafe(int x, int y, int m, int n) {
        return x >= 0 && y >=0 && x < m && y < n;
    }
}
