package com.company.baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나무자르기_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        int max = -1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int start = 0;
        int end = max;
        int answer =0;
        while (start <= end) {
            int mid = (start + end) / 2;
            long target =0;
            for (int a : arr){
                if (a > mid){
                    target += a-mid;
                }
            }
            if (target>=m){
                start = mid+1;
                answer = mid;
            }else {
                end = mid-1;
            }
        }
        System.out.println(answer);
    }
}
