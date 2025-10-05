package com.dsa.searching;

import com.dsa.trees.BinaryNode;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        BinarySearch bs = new BinarySearch();
        int i = bs.binarySearch(array, 0, array.length-1, 2);
        System.out.println(i);

    }

    private int binarySearch(int[] array, int low, int high, int value) {

        if(low > high)
            return -1;

        int mid = (low + high)/2;
        if(array[mid] == value) {
            return mid;
        }

        if(array[mid] < value) {
            return binarySearch(array, mid+1, array.length, value);
        }
        return binarySearch(array, 0, mid-1, value);
    }

}
