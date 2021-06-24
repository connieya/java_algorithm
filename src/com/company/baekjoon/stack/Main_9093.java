package com.company.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class Main_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- >0){
            String str = br.readLine()+" ";
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for (char c : str.toCharArray()){
                if (c == ' '){
                    while (!stack.empty()){
                        bw.write(stack.pop());
                    }
                    bw.write(c);
                }else {
                    stack.push(c);
                }
            }
            bw.flush();
        }
    }

}
