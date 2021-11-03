package com.company.study.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 조합수 {
    static int count =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        dfs(0,n,m,1);
        System.out.println(count);
    }

    public static void dfs(int L, int n, int m , int start) {
        if (L == m) {
            count++;
            return;
        }

        for (int i = start; i <= n; i++) {
            dfs(L + 1, n, m, i+1);

        }
    }
}
