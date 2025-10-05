package com.dsa.stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);

        Integer peek = s.peek();
        for(Integer value: s) {
            System.out.println(value);
        }
        System.out.println("----------------------");
        System.out.println(peek);
        System.out.println("----------------------");
        for(Integer value: s) {
            System.out.println(value);
        }
    }
}
