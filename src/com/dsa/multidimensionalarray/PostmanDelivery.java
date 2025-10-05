package com.dsa.multidimensionalarray;

public class PostmanDelivery {

    // Method to calculate the number of days the postman will take to deliver posts
    public static int calculateDeliveryDays(int[][] matrix) {
        int days = 0; // Keep track of the days
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Iterate through the matrix row by row
        for (int i = 0; i < rows; i++) {
            boolean waterEncountered = false;
            // Check each house in the row
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {  // 0 represents water (obstruction)
                    waterEncountered = true;
                    break; // Skip to the next day as the postman can't deliver today
                }
            }

            // If water is encountered, we need an extra day to continue delivery
            if (waterEncountered) {
                days++;  // Increment day counter
            } else {
                days++;  // Postman can deliver all houses in this row in one day
            }
        }

        return days;
    }

    public static void main(String[] args) {
        // Example 2D matrix (0 = house, 1 = water)
//        int[][] matrix = {
//                {0, 0, 0, 1, 0},  // Water is encountered in the fourth house
//                {0, 0, 0, 0, 0},  // No water (all houses can be delivered to)
//                {1, 0, 0, 0, 0},  // Water in the first house of this row
//                {0, 0, 1, 0, 0}   // Water in the third house of this row
//        };

        int[][] matrix = {
                {1, 1, 0, 1},  // Water is encountered in the fourth house
                {1, 1, 0, 1},  // No water (all houses can be delivered to)
                {0, 0, 1, 0},  // Water in the first house of this row
                {0, 0, 1, 1}   // Water in the third house of this row
        };

        // Call the method to calculate delivery days
        int result = calculateDeliveryDays(matrix);

        // Output the result
        System.out.println("The number of days the postman will take to deliver posts is: " + result);
    }
}