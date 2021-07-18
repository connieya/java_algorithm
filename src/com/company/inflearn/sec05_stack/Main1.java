package com.company.inflearn.sec05_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {

    public String solution(String input){

        Stack<Character> st = new Stack<Character>();

        String answer = "YES";

        for (char x : input.toCharArray()){
            if (x == '('){
                st.push(x);
            }else{
                if (st.isEmpty()) return "NO";
                st.pop();
            }
        }

        if (!st.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        Main1 T = new Main1();
        System.out.println(T.solution(input));


    }

}
