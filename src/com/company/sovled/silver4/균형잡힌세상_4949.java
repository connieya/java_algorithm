package com.company.sovled.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            boolean isValid = true;
            if (str.equals(".")){
                break;
            }
            for (char ch : str.toCharArray()){
                if (ch =='(' || ch =='['){
                    stack.push(ch);
                }else if (ch ==']' || ch==')') {
                    if (isValid(stack,ch)){
                        stack.pop();
                    }else{
                        isValid = false;
                        break;
                    }
                }
            }
            if (!isValid || !stack.isEmpty()){
                sb.append("no\n");
            }else{
                sb.append("yes\n");
            }
        }
        System.out.println(sb);
    }
    public static boolean isValid(Stack<Character> stack , char ch){
        if (stack.isEmpty()){
            return false;
        }
        if (ch==']' && (stack.peek() != '[')) {
            return false;
        }
        if (ch ==')' && stack.peek() != '(') {
            return false;
        }
        return true;
    }
}
