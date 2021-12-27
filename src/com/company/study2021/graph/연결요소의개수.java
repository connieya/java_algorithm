package com.company.study2021.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 연결요소의개수 {
    static int N, M;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] checked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        checked = new int[N+1];
        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int count =0;
        for (int i=1; i<=N; i++) {
            if (checked[i] == 0){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void dfs(int L) {
        checked[L] = 1;
        for (int element : graph.get(L)) {
            if (checked[element] == 0) {
                dfs(element);
            }
        }

    }
}
