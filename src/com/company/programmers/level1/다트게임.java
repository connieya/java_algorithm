package com.company.programmers.level1;

import java.util.Stack;

public class 다트게임 {
    public static void main(String[] args) {
        String dartResult = "1T2D3D#";
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                if (dartResult.charAt(i + 1) == '0' && c == '1') {
                    stack.push(10);
                    i++;
                } else {
                    stack.push(c - '0');
                }
            } else {
                if (c == 'D') {
                    int val = stack.pop();
                    stack.push(val * val);
                } else if (c == 'T') {
                    int val = stack.pop();
                    stack.push((int) Math.pow(val, 3));
                } else if (c == '*') {
                    int prev = stack.pop();
                    if (!stack.isEmpty()) {
                        int val = stack.pop() * 2;
                        stack.push(val);
                    }
                    stack.push(prev * 2);
                } else if (c == '#') {
                    int val = stack.pop();
                    stack.push(val * -1);
                }
            }

        }
    }

}
