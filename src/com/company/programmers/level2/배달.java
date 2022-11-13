package com.company.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Edge implements Comparable<Edge> {
    int node;
    int cost;

    public Edge(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return o.cost-this.cost;
    }
}


public class 배달 {
    static int d[];
    static ArrayList<ArrayList<Edge>> graph;
    public static void main(String[] args) {
        int n = 6;
        int road[][] = {
                {1, 2, 1},
                {1, 3, 2},
                {2, 3, 2},
                {3, 4, 3},
                {3, 5, 2},
                {3, 5, 3},
                {5, 6, 1}
        };
        graph= new ArrayList<>();
        d = new int[n+1];
        Arrays.fill(d,214700000);
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        for (int i=0; i<road.length; i++) {
            int a = road[i][0];
            int b = road[i][1];
            int c = road[i][2];
            graph.get(a).add(new Edge(b,c));
            graph.get(b).add(new Edge(a,c));
        }
        dijkstra(1);
        System.out.println(Arrays.toString(d));
    }
    public static void dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start,0));
        d[start] = 0;
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            int now  = cur.node;
            int cost = cur.cost;
            if (d[now] < cost) continue;
            for (Edge nx : graph.get(now)) {
                int next = nx.node;
                int next_cost = nx.cost;
                if(d[next] > cost+next_cost) {
                    d[next] = cost+next_cost;
                    pq.add(new Edge(next,cost+next_cost));
                }
            }
        }
    }
}
