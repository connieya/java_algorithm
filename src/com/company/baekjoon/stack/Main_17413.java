package com.company.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main_17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean tag = false;
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '<') {
                while (!stack.empty()) {
                    System.out.print(stack.pop());
                }
                tag = true;
                System.out.print(c);
            } else if (c == '>') {
                tag = false;
                System.out.print(c);
            } else if (tag) {
                System.out.print(c);
            } else {
                if (c == ' ') {
                    while (!stack.empty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(c);
                } else {
                    stack.push(c);
                }
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}
