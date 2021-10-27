package com.company.study.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N, E;
    static int graph[][];
    static int Dist[];
    static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        graph = new int[N][N];
        Dist = new int[N];
        while (E-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = v;
        }
        dijkstra(0);
        for (int d : Dist){
            System.out.print(d+" ");
        }
    }

    static void dijkstra(int src) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[] visited = new boolean[N];
        for (int j = 0; j < N; j++) {
            Dist[j] = INF;
        }
        Dist[src] = 0;
        pq.add(new int[]{0, src});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[1];
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            for (int i = 0; i < N; i++) {
                if (Dist[i] > Dist[u] + graph[u][i]) {
                    Dist[i] = Dist[u] + graph[u][i];
                    pq.add(new int[]{Dist[i], u});
                }
            }
        }
    }
}
