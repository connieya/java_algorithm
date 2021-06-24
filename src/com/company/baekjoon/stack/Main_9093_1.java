package com.company.baekjoon.stack;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main_9093_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- >=0){
            String str = sc.nextLine();
            str += " ";
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for (char ch : str.toCharArray()){
                if (ch == '\n' || ch ==' '){
                    while (!stack.empty()){
                        sb.append(stack.pop());
                    }
                    sb.append(ch);
                }else {
                    stack.push(ch);
                }
            }
            System.out.println(sb);
        }

    }

}
