package com.company.study2022.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 촌수_2644 {
    static int a, b ,ans = -1;
    static List<ArrayList<Integer>> graph;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();
        visited = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        visited[a] = true;
        dfs(1, a);
        System.out.println(ans);
    }

    public static void dfs(int count, int a) {
        for (int element : graph.get(a)){
            if (element == b){
                ans = count;
                return;
            }
           if (!visited[element]){
               visited[element] = true;
               dfs(count+1,element);
           }
        }
    }
}
