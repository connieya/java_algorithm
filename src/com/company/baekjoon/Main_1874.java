package com.company.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main_1874 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        ArrayList<Character> answer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        for (int i=0; i<n; i++){
            int s = sc.nextInt();
            if (s > m){
                while (s>m){
                    stack.push(++m);
                    answer.add('+');
                }
                stack.pop();
                answer.add('-');
            }else {
                if (stack.peek() != s){
                    System.out.println("NO");
                    return;
                }
                stack.pop();
                answer.add('-');
            }
        }

        for (char c : answer){
            System.out.println(c);
        }


    }
}
