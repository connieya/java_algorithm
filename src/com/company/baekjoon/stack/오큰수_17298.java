package com.company.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class 오큰수_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        String[] str = br.readLine().split(" ");
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> stack =new Stack<>();
        stack.push(0);
        for (int i=1; i<N; i++){
            if (stack.isEmpty()){
                stack.push(i);
            }
            while (!stack.isEmpty() && arr[stack.peek()]< arr[i]){
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            arr[stack.pop()] = -1;
        }
        for (int x : arr){
           bw.write(x+" ");
        }
        bw.flush();
    }
}
