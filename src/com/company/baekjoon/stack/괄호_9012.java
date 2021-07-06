package com.company.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class 괄호_9012 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Stack<Character> stack= new Stack<>();
        while (T-- >0){
            String answer ="YES";
            String str = sc.next();
            for (char c : str.toCharArray()){
                if (c == '(') stack.push(c);
                else {
                    if (stack.isEmpty()) {
                        answer = "NO";
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) answer="NO";
            stack.clear();
            System.out.println(answer);

        }
    }
}
