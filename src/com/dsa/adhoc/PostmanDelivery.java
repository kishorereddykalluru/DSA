package com.dsa.adhoc;

public class PostmanDelivery {
    // Function to check if a cell is within grid boundaries
    public static boolean isValid(int i, int j, int n, int m) {
        return (i >= 0 && i < n && j >= 0 && j < m);
    }

    // Function to calculate the number of days needed for delivery
    public static int calculateDeliveryDays(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int days = 0;

        // Directions array: right, down, left, up (4 cardinal directions)
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        // To track the visited houses
        boolean[][] visited = new boolean[n][m];

        // Loop until all houses are delivered to
        while (true) {
            boolean allDelivered = true;
            boolean[][] dailyVisited = new boolean[n][m];

            // Traverse the grid for this day
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1 && !visited[i][j] && !dailyVisited[i][j]) {
                        // Mark current house as visited for this day
                        visited[i][j] = true;
                        dailyVisited[i][j] = true;

                        // Deliver to adjacent houses (if possible)
                        for (int dir = 0; dir < 4; dir++) {
                            int ni = i + dx[dir];
                            int nj = j + dy[dir];

                            if (isValid(ni, nj, n, m) && grid[ni][nj] == 1 && !visited[ni][nj] && !dailyVisited[ni][nj]) {
                                dailyVisited[ni][nj] = true;
                                visited[ni][nj] = true;
                            }
                        }
                    }
                }
            }

            // If no house was delivered today, break out of the loop
            boolean deliveredToday = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (dailyVisited[i][j]) {
                        deliveredToday = true;
                        break;
                    }
                }
                if (deliveredToday) break;
            }

            if (!deliveredToday) break;

            // Increment the day counter after a round of delivery
            days++;
        }

        return days;
    }

    public static void main(String[] args) {
        // Input grid: 1 represents houses to deliver, 0 represents empty spaces
        int[][] grid = {
                {1, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 1, 1}
        };

        // Calculate and print the number of days
        int daysRequired = calculateDeliveryDays(grid);
        System.out.println("Number of days required: " + daysRequired);
    }
}

