package com.company.study.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DFS와BFS_1260 {
    static int N, M, V;
    static int graph[][];
    static int ch[];
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        ch = new int[N+1];

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        dfs(V , 1);
        System.out.println(sb);

    }
    public static void dfs(int v , int start) {
        if (start == N) {
            return;
        }
        for (int i=1; i<=N; i++) {
            if (graph[v][i] ==1 && ch[v] == 0) {
                sb.append(V).append(" ");
                ch[i] = 1;
                dfs(i , start+1);
                ch[i] = 0;
            }
        }

    }
}
