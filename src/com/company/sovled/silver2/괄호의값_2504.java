package com.company.sovled.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class 괄호의값_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        int num = 1;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
                num *= 2;
            } else if (str.charAt(i) == '[') {
                stack.push(str.charAt(i));
                num *= 3;
            } else {
                if (!isValid(stack, str.charAt(i))) {
                    sum = 0;
                    break;
                } else if (str.charAt(i) == ')') {
                    if (str.charAt(i - 1) == '(') {
                        sum += num;
                    }
                    num /= 2;
                } else if (str.charAt(i) == ']') {
                    if (str.charAt(i - 1) == '[') {
                        sum += num;
                    }
                    num /= 3;

                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println(sum);
        } else {
            System.out.println(0);
        }
    }

    public static boolean isValid(Stack<Character> stack, char ch) {
        if (stack.isEmpty()) {
            return false;
        }
        if (ch == ']' && (stack.peek() != '[')) {
            return false;
        }
        if (ch == ')' && stack.peek() != '(') {
            return false;
        }
        return true;
    }
}
