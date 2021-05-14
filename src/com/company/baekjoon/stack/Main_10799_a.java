package com.company.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main_10799_a {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        int n = a.length();
        Stack<Integer> stack= new Stack<>();
        int count = 0;
        for (int i=0; i<n; i++){
            char c  = a.charAt(i);
            if (c =='('){
                stack.push(i);
            }else {
                if (stack.peek()+1 == i){ // 레이저
                    stack.pop();
                    count +=  stack.size();
                }else { // 막대기의 끝
                    stack.pop();
                    count += 1;
                }
            }
        }

        System.out.println(count);


    }
}
