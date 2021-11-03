package com.company.study.week6;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 상근이의여행_9372 {
    static ArrayList<ArrayList<Integer>> graph;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            count = 0;
            graph = new ArrayList<>();
            boolean visited[] = new boolean[N+1];
            for (int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            dfs(visited);
            bw.write(count+" \n");
            bw.flush();

        }
    }

    public static void dfs(boolean visited[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] =true;
        while (!queue.isEmpty()) {
            int i = queue.poll();
            for (int element : graph.get(i)) {
                if (!visited[element]) {
                    visited[element] = true;
                    queue.offer(element);
                    count++;
                }
            }
        }
    }

}
