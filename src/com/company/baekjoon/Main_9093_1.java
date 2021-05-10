package com.company.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Main_9093_1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(arr[1]);
        System.out.println(arr[0]);

//        Stack<Character> stack = new Stack<>();
//        String answer = "";
//        for (int i = 0; i < n; i++) {
//            for (char c : arr[i].toCharArray()) {
//                if (c == ' ' || c == '\n') {
//                    while (!stack.empty()) {
//
//                        answer += stack.pop();
//                    }
//                    answer += " ";
//                } else {
//                    stack.push(c);
//                }
//            }
//            System.out.println(answer);
//        }


    }

}
