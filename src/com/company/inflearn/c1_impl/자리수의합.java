package com.company.inflearn.c1_impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자리수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int answer = 0;
        int sum =0;
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
             sum = digit_sum(arr[i]);
            if (sum > max){
                max = sum;
            }
        }
        for (int i=0; i<n; i++){
            if (digit_sum(arr[i]) == sum){
                answer = Math.max(answer , arr[i]);
            }
        }
        System.out.println(answer);
    }
    static int digit_sum(int x) {
        int sum =0;
        while (x >0){
            sum += x%10;
            x /= 10;
        }
        return sum;
    }
}
