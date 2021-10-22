package com.company.study.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 증복순열구하기 {
    static int N , M;
    static int arr[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        dfs(0);
        System.out.println(sb);
    }
    public static void dfs(int L) {
        if (L == M) {
            for (int a : arr){
                sb.append(a+" ");
            }
            sb.append("\n");
        }else {
            for (int i=1; i<=N; i++) {
                arr[L] = i;
                dfs(L+1);
            }
        }
    }
}
