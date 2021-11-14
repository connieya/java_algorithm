package com.company.dongbinbook.diklstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Edge {
    int edge;
    int distance;

    public Edge(int edge, int distance) {
        this.edge = edge;
        this.distance = distance;
    }
}

public class 간단한다익스트라_my_exam {
    static int n, m;
    static List<ArrayList<Edge>> graph = new ArrayList<>();
    static boolean visited[];
    static int dy[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        dy = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        int start = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            graph.get(Integer.parseInt(st.nextToken())).add(new Edge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Arrays.fill(dy, 100_000);
        dijkstra(start);
        for (int i = 1; i <= n; i++) {
            if (dy[i] == 100_000) {
                System.out.println("-1");
            } else {
                System.out.println(dy[i]);
            }
        }
    }

    public static void dijkstra(int start) {
        dy[start] = 0;
        visited[start] = true;
        for (Edge edge : graph.get(start)) {
            dy[edge.edge] = edge.distance;
        }
        // 시작 노드 초기화 작업 끝

        // 시작 노드 빼고 모든 노드를 탐색해야 함
        for (int k=1; k<n-1; k++){
            // 방문하지 않는 노드를 노드 1번 부터 탐색한다.
            // 결과적으로 원하는 결과가 나오지 않는다.
            // 연결되어 있는 간선의 흐름이 아니라 막무가내로 탐색하기 때문이다.
           for (int i=1; i<=n; i++) {
               if (!visited[i]) {
                   visited[i] = true;
                   for (Edge now : graph.get(i)) {
                       int cost = dy[i] + now.distance;
                       dy[now.edge] = Math.min(cost , dy[now.edge]);
                   }
               }
           }
        }
    }
}
