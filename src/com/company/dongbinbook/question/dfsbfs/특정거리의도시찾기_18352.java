package com.company.dongbinbook.question.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Edge implements Comparable<Edge> {
    int edge;
    int cost;

    public Edge(int edge, int cost) {
        this.edge = edge;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost-o.cost;
    }
}

public class 특정거리의도시찾기_18352 {
    static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
    static int dy[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        dy = new int[N+1];
        Arrays.fill(dy , Integer.MAX_VALUE);
        for (int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b,1));
        }
        dijkstra(X);
        int count =0;
        for (int i=1; i<=N; i++){
            if (dy[i] == K){
                count++;
                System.out.println(i);
                continue;
            }
        }
        if (count==0){
            System.out.println(-1);
        }
    }
    public static void dijkstra(int start) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(start,0));
        dy[start] = 0;
        while (!priorityQueue.isEmpty()){
           Edge edge = priorityQueue.poll();
           if (dy[edge.edge] < edge.cost){
               continue;
           }
            for (Edge next :  graph.get(edge.edge)) {
                if (dy[next.edge] > edge.cost + next.cost) {
                    dy[next.edge] = edge.cost+next.cost;
                    priorityQueue.offer(new Edge(next.edge , edge.cost+next.cost));
                }
            }
        }
    }
}
