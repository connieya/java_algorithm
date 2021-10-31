package com.company.study.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 친구인가 {
    static int N, M;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean [] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        check = new boolean[N+1];
        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        st = new StringTokenizer(br.readLine());
        int f1 = Integer.parseInt(st.nextToken());
        int f2 = Integer.parseInt(st.nextToken());
        check[f1] = true;
        dfs(f1);
        if (check[f1] && check[f2]){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
    public static void dfs(int L) {
        for (int i : graph.get(L)) {
            if (!check[i]) {
                check[i] = true;
                dfs(i);
            }
        }
    }
}
