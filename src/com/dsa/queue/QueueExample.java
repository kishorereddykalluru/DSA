package com.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        for(Integer value: q) {
            System.out.println(value);
        }
        reverseQueue(q);
        System.out.println("----------------------------");
        for(Integer value: q) {
            System.out.println(value);
        }
    }

    private static void reverseQueue(Queue<Integer> q) {
        // In recursion base condition is mandatory to stop the stack overflow error
        if(q.isEmpty()) {
            return;
        }
        Integer poll = q.poll();
        reverseQueue(q);
        q.add(poll);
    }
}
