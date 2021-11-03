package com.company.study.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바둑이승차 {
    static int MAX = Integer.MIN_VALUE;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[i] = value;
        }
        dfs(0,C,0,N);
        System.out.println(MAX);
    }

    public static void dfs(int L, int C, int sum, int N) {
        if (L == N) {
            if (sum <= C) {
                MAX = Math.max(MAX, sum);
            }

            return;
        }
        dfs(L + 1, C, sum, N);
        dfs(L + 1, C, sum + arr[L], N);
    }
}
