package com.company.inflearn.sec07_recursive;

import java.util.Scanner;

public class 경로탐색_dfs {
    static int node, edge, count = 0;
    static int graph[][];
    static int ch[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        edge = sc.nextInt();
        graph = new int[node + 1][node + 1];
        ch = new int[node + 1];
        while (edge-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
        }
        dfs(1);
        ch[1] = 1;
        System.out.println(count);
    }

    public static void dfs(int l) {
        if (l == node) {
            count++;
        } else {
            for (int i = 1; i <= node; i++) {
                if (graph[l][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }

    }

}
