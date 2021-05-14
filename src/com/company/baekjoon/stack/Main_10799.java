package com.company.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main_10799 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Character> stack = new Stack<>();

        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }else {
                if (str.charAt(i-1) == '('){
                    stack.pop();
                    count += stack.size();
                }else {
                    stack.pop();
                    count +=1;
                }

            }
        }

        System.out.println(count);
    }
}
