package com.company.study.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node implements Comparable<Node> {
    int edge;
    int distance;

    public Node(int edge, int distance) {
        this.edge = edge;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node o) {
        return this.distance - o.distance;
    }
}

public class 다익스트라알고리즘 {
    static int N, M;
    static List<ArrayList<Node>> graph = new ArrayList<>();
    static int dy[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dy = new int[N + 1];
        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Node(b,v));
        }
        Arrays.fill(dy,Integer.MAX_VALUE);
        dijkstra(2);
        for (int i =1; i<=N; i++) {
            if (dy[i] != Integer.MAX_VALUE) {
                System.out.println(i+" : "+dy[i] );
            }else {
                System.out.println(i+" : impossible");
            }
        }

    }
    public static void dijkstra(int v) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(v,0));
        dy[v] = 0;
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            if (dy[current.edge] < current.distance) {
                continue;
            }
            for (Node next : graph.get(current.edge)){
                if (dy[next.edge] > current.distance + next.distance){
                    dy[next.edge] =  current.distance + next.distance;
                    pq.offer(new Node(next.edge,current.distance+next.distance));
                }
            }
        }
    }
}
