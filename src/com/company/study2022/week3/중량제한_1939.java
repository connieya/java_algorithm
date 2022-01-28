package com.company.study2022.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Bridge implements Comparable<Bridge> {
    int next;
    int weight;

    public Bridge(int next, int weight) {
        this.next = next;
        this.weight = weight;
    }

    @Override
    public int compareTo(Bridge o) {
        return o.weight - this.weight;
    }
}

public class 중량제한_1939 {
    static int MX = 100000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x, y;
        List<ArrayList<Bridge>> bridges = new ArrayList<>();
        int d[] = new int[n + 1];
        Arrays.fill(d, -1);
        for (int i = 0; i <= n; i++) {
            bridges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            bridges.get(a).add(new Bridge(b, c));
            bridges.get(b).add(new Bridge(a,c));
            System.out.println(a + " " + b + "  " + c);
        }
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        System.out.println(x + "  " + y);
        PriorityQueue<Bridge> pq = new PriorityQueue<>();
        pq.offer(new Bridge(x, 0));
        d[x] = MX;
        while (!pq.isEmpty()) {
            Bridge cur = pq.poll();
            int now = cur.next;
            int weight = cur.weight;
            if (d[now] > weight) continue;
            for (Bridge next : bridges.get(now)) {
                int next_bridge = next.next;
                int next_weight = next.weight;
                if (d[next_bridge] < next_weight + weight) {
                    d[next_bridge] = next_weight + weight;
                    pq.offer(new Bridge(next_bridge, next_weight + weight));
                }
            }
        }
        for (int g : d){
            System.out.print(g+" ");
        }
    }
}
