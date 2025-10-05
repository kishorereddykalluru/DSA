package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletZeros {

    public static void main(String[] args) {

        int[] array = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> arrayLists1 = threeSum(array);
        arrayLists1.forEach(list1 -> System.out.println(list1.get(0) + " " +list1.get(1) + " " + list1.get(2)));
    }

    private static List<List<Integer>> threeSum(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        if(array.length < 3) return new ArrayList<>();

        Arrays.sort(array);
        for(int i = 0; i < array.length - 2; i++) {
            if(i > 0 && array[i] == array[i-1])
                continue;

            int left = i + 1;
            int right = array.length - 1;
            while(left < right) {
                int sum = array[i] + array[left] + array[right];
                if(sum == 0) {
                    result.add(Arrays.asList(array[i], array[left], array[right]));
                    while(left < right && array[left] == array[left+1])
                        left++;
                    while(left < right && array[right] == array[right-1])
                        right--;
                    left++;
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
