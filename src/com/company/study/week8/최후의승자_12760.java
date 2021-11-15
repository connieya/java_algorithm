package com.company.study.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최후의승자_12760 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Integer graph[][] = new Integer[N+1][M];
        int dir [] = new int[N+1];
        for (int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(graph[i] , Collections.reverseOrder());
        }
        for (int i=0; i<M; i++) {
            int max =0;
            for (int j=1; j<=N; j++) {
                max = Math.max(max,graph[j][i]);
            }
            for (int j=1; j<=N; j++){
                if (graph[j][i] == max) {
                    dir[j]++;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        int max = Arrays.stream(dir).max().getAsInt();
        for (int i=1; i<=N; i++){
            if (dir[i]==max){
                list.add(i);
            }
        }
        for (int i: list){
            System.out.print(i+" ");
        }
    }
}
