package com.company.code_plus.lecture01.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main_1874 {
    public static void solve(int []arr){
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int m = 0;
        for (int x : arr){
            if (m<x){
                while (m<x){
                    stack.push(++m);
                   sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else {
                if (stack.peek()!=x){
                    System.out.println("NO");
                    return;
                }
                stack.pop();
                sb.append("-\n");

            }
        }
        System.out.println(sb);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        solve(array);
    }

}
