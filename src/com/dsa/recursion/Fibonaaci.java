package com.dsa.recursion;

public class Fibonaaci {
    public static void main(String[] args) {
        Fibonaaci fibonaaci = new Fibonaaci();
        int result = fibonaaci.fibonacci(9);
        //int result1 = fibonaaci.fibonacciIterative(9);
        System.out.println(result);
    }

    private int fibonacciIterative(int number) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;

        for(int i = 2; i <= number; i++) {
             f2 = f0+f1;
             f0 = f1;
             f1 = f2;
        }
        return f2;
    }

    private int fibonacci(int number) {
        if(number < 2)
            return number;
        return fibonacci(number-1) + fibonacci(number-2);
    }
}
