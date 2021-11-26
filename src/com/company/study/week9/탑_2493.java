package com.company.study.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Top {
    int height;
    int num;

    public Top(int height, int num) {
        this.height = height;
        this.num = num;
    }
}

public class 탑_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Top> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++){
            int height = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty() && height > stack.peek().height) {
                stack.pop();
            }
            if (stack.isEmpty()){
                sb.append("0 ");
            }else{
                sb.append(stack.peek().num+" ");
            }
            stack.push(new Top(height, i+1));
        }
        System.out.println(sb);

    }
}
