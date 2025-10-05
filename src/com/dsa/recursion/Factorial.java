package com.dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int result = fact.factorial(6);
        System.out.println(result);
    }

    private int factorial(int number) {

        if(number == 0)
            return 1;

        return number * factorial(number-1);
    }
}
