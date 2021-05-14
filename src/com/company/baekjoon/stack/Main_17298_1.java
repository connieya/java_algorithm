package com.company.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main_17298_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] seq = new int[n];

        for (int i=0; i<n; i++){
            seq[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<n; i++){
            while (!stack.isEmpty() && seq[stack.peek()] < seq[i]){
                seq[stack.pop()] = seq[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()){
            seq[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++){
            sb.append(seq[i]).append(' ');
        }
        System.out.println(sb);

    }
}
