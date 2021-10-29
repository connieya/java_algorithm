package com.company.code_plus.lecture02.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 단지번호붙이기_2667 {
    static int N;
    static int graph[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        int answer =0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        List<Integer> danji = new ArrayList<>();

        for (int i=0; i< N; i++) {
            for (int j=0; j<N; j++) {
                if (graph[i][j] == 1){
                    graph[i][j] = 0;
                    answer++;
                    count = 1;
                    danji.add(dfs(i,j));
                }
            }
        }
        Collections.sort(danji);
        System.out.println(answer);
        for (int d : danji) {
            System.out.println(d);
        }
    }
    public static int dfs(int i , int j) {
        for (int k=0; k<4; k++) {
            int nx =  i + dx[k];
            int ny =  j + dy[k];
            if (nx >=0 && nx < N && ny >=0 && ny <N && graph[nx][ny] ==1) {
                graph[nx][ny] = 0;
                dfs(nx , ny);
                count++;
            }
        }
        return count;
    }
}
