package com.company.study.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분수열의합_1182 {
    static int N, S;
    static int[] arr;
    static int[] check;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        check = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);
        if (S == 0) {
            System.out.println(count - 1);
        } else {
            System.out.println(count);
        }
    }

    public static void dfs(int L) {
        if (L == N) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (check[i] == 1) {
                    sum += arr[i];
                }
            }

            if (sum == S) {
                count++;
            }
            return;
        }

        check[L] = 1;
        dfs(L + 1);
        check[L] = 0;
        dfs(L + 1);
    }
}
