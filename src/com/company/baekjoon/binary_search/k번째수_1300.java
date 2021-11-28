package com.company.baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class k번째수_1300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        long arr[] = new long[n * n];
        int v =0;
        for (long i=1; i<=n; i++){
            for (long j=1; j<=n;j++){
                arr[v++] =i*j;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
