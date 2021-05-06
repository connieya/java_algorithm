package com.company.inflearn.sec05;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {

    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()){
            if (Character.isDigit(x)) stack.push(x-48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                switch (x){
                    case '+':
                        stack.push(lt+rt);
                        break;
                    case '-':
                        stack.push(lt-rt);
                        break;
                    case '*':
                        stack.push(lt*rt);
                        break;
                    case '/':
                        stack.push(lt/rt);
                        break;
                }
            }

        }
        answer = stack.get(0);


        return answer;

    }

    public static void main(String[] args) {
        Main4 T  = new Main4();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
