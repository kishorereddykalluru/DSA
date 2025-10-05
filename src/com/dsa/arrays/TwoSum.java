package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        List<List<Integer>> result = twosum(nums, 2);
        System.out.println(result);
    }

    private static List<List<Integer>> twosum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 2)
            return new ArrayList<>();

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int total = nums[left] + nums[right];
            if(total == target) {
                result.add(Arrays.asList(nums[left], nums[right]));
                while(left < right && nums[left] == nums[left+1])
                    left++;
                while(left < right && nums[right] == nums[right-1])
                    right++;
                left++;
                right--;
            } else if(total < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }


}
