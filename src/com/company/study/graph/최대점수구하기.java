package com.company.study.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대점수구하기 {
    static int N, M;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int graph[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[i][0] = a;
            graph[i][1] = b;
        }
        dfs(0,graph,0,0);
        System.out.println(max);
    }

    public static void dfs(int depth , int graph[][] , int sum , int time) {
        if (depth == N) {
            if (time <=M) {
                max = Math.max(sum , max);
            }
            return;
        }
        dfs(depth+1 ,graph , sum , time);
        dfs(depth+1 , graph, sum +graph[depth][0] , time+graph[depth][1]);

    }
}
