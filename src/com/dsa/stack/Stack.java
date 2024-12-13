package com.dsa.stack;

import java.sql.SQLOutput;

public class Stack {

    int[] data;
    int topOfStack;

    // create stack
    public Stack(int size) {
        this.data = new int[size];
        topOfStack = -1;
        System.out.println("Stack is created");
    }
    // push
    public void push(int item) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        data[topOfStack+1] = item;
        topOfStack++;
        System.out.println("Element [" + data[topOfStack] +"] pushed to Stack");
    }
    // pop
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int item = data[topOfStack];
        topOfStack--;

        return item;
    }
    // peek
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        return  data[topOfStack];
    }
    // isEmpty
    public boolean isEmpty() {
        return topOfStack == -1;
    }
    // isFull (only for Array implementation)
    public boolean isFull() {
        return topOfStack == data.length-1;
    }
    // delete stack
    public void deleteStakc() {
        data = null;
    }


}
