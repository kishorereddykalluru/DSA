package com.dsa.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static void main(String[] args) {
        int[][] mat = { { 0, 1, 2 },
                { 0, 1, 2 },
                { 2, 1, 1 } };
        System.out.println(orangesRotting(mat));
    }

    private static int orangesRotting(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};

        Queue<int[]> q = new LinkedList<>();
        int timeElapsed = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(mat[i][j] == 2)
                    q.add(new int[] {i, j});
            }
        }

        while(!q.isEmpty()) {

            timeElapsed++;
            int len = q.size();
            while(len-- > 0) {
                int [] cur = q.poll();
                int i = cur[0];
                int j = cur[1];

                for(int[] dir: direction) {
                    int x = i + dir[0];
                    int y = j + dir[1];

                    if(isSafe(x, y, n, m) && mat[x][y] == 1) {
                        mat[x][y] = 2;
                        q.add(new int[]{x,y});
                    }
                }

            }
        }

       for(int i = 0; i < n; i++) {
           for(int j = 0; j < m; j++) {
               if(mat[i][j] == 1) {
                   return -1;
               }
           }
        }
        return  Math.max(0, timeElapsed-1);
    }

    private static boolean isSafe(int x, int y, int n, int m) {
        return (x >= 0 && y >= 0 && x < n && y < m);
    }
}
