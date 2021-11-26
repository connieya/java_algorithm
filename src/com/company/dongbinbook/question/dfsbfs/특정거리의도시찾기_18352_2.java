package com.company.dongbinbook.question.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 특정거리의도시찾기_18352_2 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int dy[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int city = Integer.parseInt(st.nextToken());
        int road = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        dy = new int[city + 1];
        for (int i=0; i<=city; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < road; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        Arrays.fill(dy, -1);
        dfs(start);
        int count=0;
        for (int i=1; i<=city; i++){
            if (dy[i] == k) {
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        }
    }

    public static void dfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        dy[start] = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : graph.get(current)) {
                if (dy[next] == -1) {
                    dy[next] = dy[current] + 1;
                    queue.offer(next);
                }
            }

        }
    }
}
