package com.company.sovled.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 연결요소의개수 {

    static boolean visited[];
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];



        for (int i=1; i<= n+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int answer = 0;
        for (int i=1; i<= n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i);
            }
        }

        System.out.println(answer);
    }

    public static void dfs(int start) {
        visited[start] = true;
        for (int nxt : graph.get(start)) {
            if (!visited[nxt]) {
                dfs(nxt);
            }
        }
    }
}
