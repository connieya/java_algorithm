package com.company.inflearn.c1_impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자연수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum =0;
        StringBuilder sb = new StringBuilder();
        for (int i=a; i<=b; i++){
            sum += i;
            if (i==b){
                sb.append(i).append("=");
                continue;
            }
            sb.append(i).append("+");
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
