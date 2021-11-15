package com.company.dongbinbook.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 플로이드워셜2 {
    static final int INF = (int) 1e9;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int graph [][] = new int[n+1][n+1];
        int m = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++){
            Arrays.fill(graph[i] , INF);
        }
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (i==j){
                    graph[i][j] = 0;
                }
            }
        }
        while (m-- >0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph[a][b] = c;
        }

        for (int k=1; k<=n; k++) {
            for (int a=1; a<=n; a++) {
                for (int b=1; b<=n; b++) {
                    graph[a][b] = Math.min(graph[a][b] ,graph[a][k]+graph[k][b]);
                }
            }
        }

        for (int a=1; a<=n; a++){
            for (int b=1; b<=n; b++) {
                if (graph[a][b] == INF) {
                    System.out.print("무한 ");
                }else {
                    System.out.print(graph[a][b]+" ");
                }
            }
            System.out.println();
        }


    }
}
