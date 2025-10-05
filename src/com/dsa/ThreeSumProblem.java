package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumProblem {

    public static void main(String[] args) {
        
        int[] array = {-1, 0, 1, 2, -1, -4};
        ArrayList<Integer[]> result = threeSum(array);
        result.stream().forEach(r -> System.out.println(r[0] + " " + r[1]+ " "+r[2]));
    }

    private static ArrayList<Integer[]> threeSum(int[] array) {
        
        if(array!=null && array.length < 3){
            return new ArrayList<>();
        }

        ArrayList<Integer[]> result = new ArrayList<>();

        Arrays.sort(array);
        int i = 0;
        int k = array.length - 1;
        while(i < k){
            int j = i + 1;
            while(j < k) {
                int sum = array[i] + array[j] + array[k];
                if(sum == 0) {
                   result.add(new Integer[]{array[i], array[j], array[k]});
                   while(array[j] == array[j+1]) {
                    j++;
                   } 
                   while(array[k] == array[k-1]){
                    k--;
                   }
                   j++;
                   k--;
                } else if(sum < 0){
                    j++;
                } else if(sum > 0) {
                    k--;
                }
            }
            i++;
        }
        return result;
    }

}
