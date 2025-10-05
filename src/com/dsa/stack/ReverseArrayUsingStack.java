package com.dsa.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50};
        //int[] result = reverseArrayUsingStack(arr);
        int[] result = reverseArrayUsingQueue(arr);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    private static int[] reverseArrayUsingQueue(int[] arr) {

        Queue<Integer> q = new LinkedList<>();

        for(int value : arr) {
            q.add(value);
        }

        reverseQueue(q);

        int[] result = new int[arr.length];
        for(int j = 0 ; j < result.length; j++){
            result[j] = q.poll();
        }

        return result;
    }

    private static void reverseQueue(Queue<Integer> q) {

        if(q.isEmpty()) return;

        Integer poll = q.poll();
        reverseQueue(q);
        q.add(poll);
    }

    private static int[] reverseArrayUsingStack(int[] arr) {

        Stack<Integer> st = new Stack<>();

        for( int value: arr) {
            st.push(value);
        }

        int[] result = new int[arr.length];

        for(int j = 0 ; j < result.length; j++){
            result[j] = st.pop();
        }

        return result;
    }
}
