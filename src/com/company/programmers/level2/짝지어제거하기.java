package com.company.programmers.level2;

import java.util.Stack;

public class 짝지어제거하기 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "baabaa";
        for (char ch : s.toCharArray()){
            if (stack.isEmpty()) {
                stack.push(ch);
                continue;
            }
            if (stack.peek() == ch){
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println(1);
        }

    }
}
