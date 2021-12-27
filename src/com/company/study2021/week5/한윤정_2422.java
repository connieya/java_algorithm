package com.company.study2021.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 한윤정_2422 {
    static int N, M;
    static boolean graph[][];
    static int visit[];
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new boolean[N + 1][N + 1];
        visit = new int[3];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = true;
            graph[b][a] = true;
        }
        dfs(0,1);
        System.out.println(answer);
    }

    public static void dfs(int L, int start) {
        if (L == 3) {
            if (check()){
                answer++;
            }
            return;
        }
        for (int i = start; i <= N; i++) {
            visit[L] = i;
            dfs(L + 1, i + 1);
        }
    }

    public static boolean check() {
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (graph[visit[i]][visit[j]]) {
                    return false;
                }
            }
        }
        return true;
    }
}
