package com.company.study2021.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 동전교환 {
    static int n;
    static int MIN = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        dfs(0,0,arr,m);
        System.out.println(MIN);
    }
    public static void dfs(int sum , int count , int arr[] ,int m) {
        if (count >=MIN) {
            return;
        }
        if (sum >= m) {
            if (sum == m) {
                MIN = Math.min(MIN, count);
            }
            return;
        }

        for (int i=n-1; i>=0; i--) {
            dfs(sum+arr[i] , count+1, arr, m);
        }

    }
}
