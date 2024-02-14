package com.company.sovled.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 트리의부모찾기_11725 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int node[];

    static void dfs(int now, int prev) {
        for (int next : graph.get(now)) {
            if (prev == next) continue;
            node[next] = now;
            dfs(next, now);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        node = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            String[] tmp = bf.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(1, -1);
        for (int i = 2; i <= n; i++) {
            System.out.println(node[i]);
        }
    }
}
