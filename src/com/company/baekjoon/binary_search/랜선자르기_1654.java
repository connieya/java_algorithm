package com.company.baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 랜선자르기_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long start = 0;
        long end = arr[n-1]+1;
        long answer =0;
        while (start<=end) {
            long mid = (start +end) /2;
            long target =0;
            for (long a : arr){
                if (a >= mid){
                    target += a/mid;
                }
            }
            if (target >= k){
                start = mid +1;
                answer = mid;
            }else {
                end = mid-1;
            }
        }
        System.out.println(answer);
    }
}
