package com.company.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌세상_4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.equals(".")) break;
            Stack<Character> stack = new Stack<>();
            String answer = "YES";
            for (char c : str.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        answer = "NO";
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        answer = "NO";
                        break;
                    }
                }
                if (!stack.isEmpty()) {
                    answer = "NO";
                }
                System.out.println(answer);
            }
        }
    }
}
