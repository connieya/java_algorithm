package com.company.sovled.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 바이러스 {

    static List<List<Integer>> graph = new ArrayList<>();
    static boolean [] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new boolean[n+1];


        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int answer = 0;
        dfs(1);

        for (int i=2; i<=n; i++) {
            if (visited[i]) {
                answer++;
            }
        }
        System.out.println(answer);

    }

    private static void dfs(int u) {
        visited[u] = true;
        for (Integer i : graph.get(u)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
