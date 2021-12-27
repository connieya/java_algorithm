package com.company.study2021.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대점수구하기_dfs {
    static boolean visited[];
    static int max = Integer.MIN_VALUE;
    static int [][] solved;
    static int n , m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
        solved = new int[n][2];
        visited = new boolean[n];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            solved[i][0] = Integer.parseInt(st.nextToken());
            solved[i][1] = Integer.parseInt(st.nextToken());
        }
        dfs(0,solved.length,0,0);
        System.out.println(max);
    }
    public static void dfs(int depth , int len , int time , int score) {
        if (time > m)  {
            return;
        }
        if (depth == len) {
                max = Math.max(score , max);
            return;
        }
        dfs(depth+1, len , time + solved[depth][1] , score+ solved[depth][0]);
        dfs(depth+1, len , time, score);
    }
}
