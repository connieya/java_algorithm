package com.company.study.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge> {
    int vex;
    int cost;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class 원더랜드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        List<ArrayList<Edge>> graph = new ArrayList<>();
        boolean [] visited = new boolean[V+1];
        for (int i=0; i<=V; i++) {
            graph.add(new ArrayList<>());
        }
        while (E-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b,c));
            graph.get(b).add(new Edge(a,c));
        }
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Edge(1,0));
        int cost  = 0;
        while (!priorityQueue.isEmpty()) {
            Edge current = priorityQueue.poll();
            if (!visited[current.vex]){
                visited[current.vex] = true;
                cost += current.cost;
                for (Edge edge : graph.get(current.vex)){
                    if (!visited[edge.vex]) {
                        priorityQueue.offer(edge);
                    }
                }
            }

        }
        System.out.println(cost);
    }
}
