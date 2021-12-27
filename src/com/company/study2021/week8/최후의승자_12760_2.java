package com.company.study2021.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 최후의승자_12760_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int graph[][] = new int[N][M];
        int max[] = new int[M];
        int dir[] = new int[N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(graph[i]);

            for (int j=0; j<M; j++) {
                if (graph[i][j] > max[j]) {
                    max[j] = graph[i][j];
                }
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++){
                if (graph[i][j] == max[j]){
                    dir[i]++;
                }
            }
        }

        int m = Arrays.stream(dir).max().getAsInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<N; i++){
            if (dir[i] == m) {
                list.add(i+1);
            }
        }
        for (int a : list ){
            System.out.print(a+" ");
        }
        br.close();;
    }
}
