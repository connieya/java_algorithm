package com.company.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main_1874_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            if (c > m) {
                while (c > m) {
                    stack.push(++m);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if (stack.peek() != c) {
                    System.out.println("NO");
                    return;
                } else {
                    stack.pop();
                    sb.append("-\n");
                }
            }
        }
            System.out.println(sb);

    }
}
