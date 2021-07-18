package com.company.inflearn.sec07_recursive;

import java.util.Scanner;

public class 경로탐색_DFS {
    static int n,m ,answer = 0;
    static int graph [][];
    static int check [];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();

        check = new int[n+1];
        graph = new int[n+1][n+1];
        for (int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        check[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
    static void DFS(int v){
        if (v==n) answer++;
        else {
            for (int i=1; i<=n; i++){
                if (graph[v][i]==1 && check[i]==0){
                    check[i] = 1;
                    DFS(i);
                    check[i] =0;
                }
            }
        }
    }
}
