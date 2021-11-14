package com.company.dongbinbook.diklstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Graph implements Comparable<Graph> {
     int index;
     int distance;

    public Graph(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Graph o) {
       if (this.distance < o.distance) {
           return -1;
       }
       return 1;
    }
}

public class 개선된다익스트라 {
    static int n, m;
    static List<ArrayList<Graph>> graph = new ArrayList<>();
    static int dy[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dy = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        int start = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            graph.get(Integer.parseInt(st.nextToken())).add(new Graph(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Arrays.fill(dy, Integer.MAX_VALUE);
        dijkstra(start);

        for (int i=1; i<=n; i++){
            if (dy[i]== Integer.MAX_VALUE){
                System.out.println(-1);
            }else {
                System.out.println(dy[i]);
            }
        }
    }
    public static void dijkstra(int start) {
        PriorityQueue<Graph> pq = new PriorityQueue<>();
        pq.offer(new Graph(start,0));
        dy[start] = 0;
        while (!pq.isEmpty()) {
            Graph edge = pq.poll();
            int distance = edge.distance;;
            int now = edge.index;
            if (dy[now] < distance) {
                continue;
            }
            for (Graph next : graph.get(now)){
                int cost = dy[now]+ next.distance;
                if (cost < dy[next.index]){
                    dy[next.index] = cost;
                    pq.offer(new Graph(next.index , cost));
                }

            }
        }

    }
}
