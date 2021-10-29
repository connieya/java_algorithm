package com.company.study.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그래프최단거리_BFS {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean check[];
    static int dir[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        check = new boolean[N + 1];
        dir = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        bfs(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + dir[i]);
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        check[v] = true;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (!check[nv]) {
                   check[nv] = true;
                   dir[nv] = dir[cv]+1;
                   queue.offer(nv);
                }
            }
        }
    }
}
