package com.company.study.n_m;

import java.io.*;
import java.util.StringTokenizer;

public class N과M3 {
    static int n, m;
    static int arr[];
    static boolean check[];
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        check = new boolean[n + 1];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int L) throws IOException {
        if (L == m) {
            for (int a : arr) {
               sb.append(a).append(" ");
            }
           sb.append("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                arr[L] = i;
                dfs(L + 1);

            }
        }
    }
}
