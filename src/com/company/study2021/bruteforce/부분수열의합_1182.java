package com.company.study2021.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분수열의합_1182 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(s, arr, 0, 0, n);
        if (s == 0) {
            System.out.println(count - 1);
        } else {
            System.out.println(count);
        }
    }

    public static void dfs(int s, int arr[], int sum, int depth, int n) {
        if (depth == n) {
            if (sum == s) {
                count++;
            }
            return;
        }

        dfs(s, arr, sum, depth + 1, n);
        dfs(s, arr, sum + arr[depth], depth + 1, n);
    }
}
