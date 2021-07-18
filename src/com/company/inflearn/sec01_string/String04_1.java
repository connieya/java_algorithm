package com.company.inflearn.sec01_string;

import java.util.Scanner;
import java.util.Stack;

public class String04_1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String  []arr = new String[n];


        Stack<Character> stack = new Stack<>();
        for (int i=0; i<n; i++){
           arr[i] = sc.next();
        }

        for (int j=0; j<n; j++){
            String answer = "";
            for (char c : arr[j].toCharArray()){
                stack.push(c);
            }
            while (!stack.empty()){
                answer+= stack.pop();
            }

            System.out.println(answer);
        }


    }
}
