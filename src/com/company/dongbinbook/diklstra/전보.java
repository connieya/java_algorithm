package com.company.dongbinbook.diklstra;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 전보 {
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static int dir[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        dir = new int[N+1];
        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Node(b,cost));
        }
        Arrays.fill(dir, Integer.MAX_VALUE);
        dijkstra(start);
        int count = 0;
        int maxDistance  = 0;
        for (int i=1; i<=N; i++) {
            if (dir[i] != Integer.MAX_VALUE){
                count++;
                maxDistance = Math.max(maxDistance,dir[i]);
            }
        }
        System.out.println(count-1 +" "+maxDistance);
    }
    public static void dijkstra(int start) {
        dir[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        while (!pq.isEmpty()) {
            Node node= pq.poll();
            if (dir[node.edge] < node.distance) {
                continue;
            }
            for (Node next : graph.get(node.edge)) {
                  int cost = node.distance + next.distance;
                  if (cost < dir[next.edge]){
                      dir[next.edge] = cost;
                      pq.offer(new Node(next.edge,cost) );
                  }
            }
        }

    }
}
