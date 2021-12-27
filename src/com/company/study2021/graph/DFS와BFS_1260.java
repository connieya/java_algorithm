package com.company.study2021.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS_1260 {
    static int N, M, V;
    static int graph[][];
    static int ch[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        graph = new int[N + 1][N + 1];
        ch = new int[N + 1];

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        ch[V] = 1;
        dfs(V);
        System.out.println();
        ch = new int[N+1];
        ch[V] = 1;
        bfs(V);
    }

    public static void dfs(int v) {
        System.out.print(v + " ");
        for (int i = 1; i <= N; i++) {
            if (graph[v][i] == 1 && ch[i] == 0) {
                ch[i] = 1;
                dfs(i);
            }
        }
    }

    public static void bfs(int L) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(L);
        while (!queue.isEmpty()) {
            int value = queue.poll();
            System.out.print(value+" ");
            for (int i=1; i<=N; i++) {
                if (graph[value][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    queue.offer(i);
                }
            }
        }
    }

}
