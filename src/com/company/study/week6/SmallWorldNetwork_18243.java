package com.company.study.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SmallWorldNetwork_18243 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int map[][];
    static int N, K;
    static boolean checked[];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        checked = new boolean[N + 1];
        String answer = "Small World!";
        map = new int[N][N];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i=1; i<=N; i++){
            for (int j=1; j<=N; j++) {
                dfs(0,i,j);
                map[i-1][j-1] = count;
                checked = new boolean[N+1];
                count = 0;
            }
        }
        for (int m[] : map){
            for (int n : m){
                System.out.print(n+" ");
            }
            System.out.println();
        }



    }
    public static void dfs(int L  , int i , int j) {
        if (i==j) {
            count = Math.min(L , count);
            return;
        }

        for (int element : graph.get(i)) {
            if (!checked[element]){
                checked[element] = true;
                dfs(L+1 , element , j);
                checked[element] = false;
            }
        }

    }
}
