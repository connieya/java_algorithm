package com.company.study.bruteforce;

import java.io.*;
import java.util.*;

public class Main {
    static int N, S;
    static int[] a;
    static int sol;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        a = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        if (S == 0)
            sol -= 1;

        System.out.println(sol);
        br.close();
    }

    static void dfs(int idx, int sum) {
        if (idx == N) {
            if (sum == S) {
                sol++;
            }
            return;
        }

        dfs(idx + 1, sum);
        dfs(idx + 1, sum + a[idx]);
    }
}