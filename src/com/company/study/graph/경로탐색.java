package com.company.study.graph;

import java.util.Scanner;

public class 경로탐색 {
    static int N , M , answer = 0;
    static int [] ch;
    static int[][] graph;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N =scanner.nextInt();
        M =scanner.nextInt();
        graph = new int[N+1][N+1];
        for (int i= 0; i<M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }
        ch = new int[N+1];
        ch[1] = 1;
        dfs(1);
        System.out.println(answer);
    }
    public static void dfs(int L) {
        if (L == N) {
            answer++;
            return;
        }
        for (int i=1; i<= N; i++) {
            if (graph[L][i] == 1 && ch[i] == 0) {
                ch[i] = 1;
                dfs(i);
                ch[i] = 0;
            }
        }
    }
}
