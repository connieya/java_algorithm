package com.company.inflearn.sec05_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

    public String solution(String input){

        String answer ="";

        Stack<Character> stack = new Stack<>();

        for (char x : input.toCharArray()){
            if (x == ')'){
                while (stack.pop() !='(');
            }else{
                stack.push(x);
            }
        }

        for (int i=0; i<stack.size(); i++){
            answer += stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main2 T = new Main2();

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(T.solution(input));


    }
}
