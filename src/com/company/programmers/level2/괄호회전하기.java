package com.company.programmers.level2;

import java.util.Stack;

public class 괄호회전하기 {
    public static void main(String[] args) {
        String s = "[](){}";
        int len = s.length();
        int count = 0;
        for (int i=0; i<len; i++) {
            if (isValid(s)) {
                count++;
            }
            s = s.substring(1,len)+s.charAt(0);
        }
        System.out.println(count);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '['){
                stack.push(ch);
                continue;
            }
            if (ch == '{'){
                stack.push(ch);
                continue;
            }
            if (ch == '(') {
                stack.push(ch);
                continue;
            }
            if (ch == ']'){
                if (stack.isEmpty() || stack.peek() != '['){
                    return false;
                }
                stack.pop();
                continue;
            }
            if (ch == '}'){
                if (stack.isEmpty() || stack.peek() != '{'){
                    return false;
                }
                stack.pop();
                continue;
            }
            if (ch == ')'){
                if (stack.isEmpty() || stack.peek() != '('){
                    return false;
                }
                stack.pop();
                continue;
            }
        }
        return true;

    }
}
