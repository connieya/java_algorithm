package com.company.dongbinbook.diklstra;

public class 플로이드워셜 {
    static int INF = (int) 1e9;
    public static void main(String[] args) {
        int [][] graph = {
                {0,4,INF,6},
                {3,0,7,INF},
                {5, INF,0,4},
                {INF,INF,2,0}
        };

        // 플로이드 워셜 알고리즘
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                for (int k=0; k<4; k++) {
                    graph[j][k] = Math.min(graph[j][k] , graph[j][i] + graph[i][k]);
                }
            }
        }
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (graph[i][j] == INF) {
                    System.out.print("무한 ");
                }else {
                    System.out.print(graph[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
