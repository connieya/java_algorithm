package com.company.sovled.gold2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 면접보는승범이네 {
    static class Node {
        int index;
        long distance;

        public Node(int index, long distance) {
            this.index = index;
            this.distance = distance;
        }
    }

    static List<List<Node>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] dis = new long[n+1];

        Arrays.fill(dis , Long.MAX_VALUE);

        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c =  Integer.parseInt(st.nextToken());

            graph.get(b).add(new Node(a,c));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparing(node-> node.distance));


        st = new StringTokenizer(br.readLine());
        for (int i=0; i<k; i++) {
            int a = Integer.parseInt(st.nextToken());
            pq.add(new Node(a,0));
            dis[a] = 0;
        }

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            if (dis[node.index] < node.distance) {
                continue;
            }

            for (Node nxt : graph.get(node.index)) {
                if (dis[nxt.index] >  nxt.distance + dis[node.index]) {
                    dis[nxt.index] = nxt.distance + dis[node.index];
                    pq.add(new Node(nxt.index,dis[nxt.index]));
                }
            }
        }

        long result[] = new long[2];

        for (int i=1; i<=n; i++) {
            if (result[1] < dis[i]) {
                result[0] = i;
                result[1] = dis[i];
            }
        }

        System.out.println(result[0]);
        System.out.println(result[1]);

    }
}
