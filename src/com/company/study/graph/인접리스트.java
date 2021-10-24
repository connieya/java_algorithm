package com.company.study.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class 인접리스트 {
    static int N, M, answer = 0;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean check[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        check = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        while (M-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }
        check[1] = true;
        dfs(1);
        System.out.println(answer);

    }

    public static void dfs(int L) {
        if (L == N) {
            answer++;
            return;
        }
        for (int nv : graph.get(L)){
            if (!check[nv]) {
                check[nv] = true;
                dfs(nv);
                check[nv] = false;
            }
        }
    }
}
