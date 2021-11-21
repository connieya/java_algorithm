package com.company.baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이항계수1_11050 {
    static int N , K;
    static int fibo[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         K = Integer.parseInt(st.nextToken());
         fibo= new int[N+1];
        System.out.println(fibo(N) / (fibo(K) * fibo(N-K)));
    }
    public static int fibo(int n){
        if (n <= 1) {
            return  1;
        }
        if (fibo[n] > 0) {
            return fibo[n];
        }
        return fibo[n] = n* fibo(n-1);
    }
}
