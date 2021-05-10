package com.company.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

// 메모리 : 18528KB 256 ms
public class Main_9012 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Stack<Character> stack = new Stack<>();


        ArrayList<String >  list = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String answer = "YES";
            for (char c : arr[i].toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        answer = "NO";
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) answer = "NO";

            list.add(answer);
            stack.clear();

        }

        for (String st : list){
            System.out.println(st);
        }
    }
}
