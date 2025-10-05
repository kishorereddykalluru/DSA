package com.dsa.stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String str = "([{}])";

        boolean b = validParenthesis(str);

        System.out.println(b);
    }

    private static boolean validParenthesis(String str) {

        if(str.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
             if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '['){
                 stack.push(str.charAt(i));
             } else if (!stack.empty() &&
                     ((stack.peek() == '(' && str.charAt(i) == ')') ||
                             (stack.peek() == '{' && str.charAt(i) == '}') ||
                             (stack.peek() == '[' && str.charAt(i) == ']')
                             )) {
                 stack.pop();
             } else {
                     return false;
             }
        }
        return stack.empty();
    }
}
