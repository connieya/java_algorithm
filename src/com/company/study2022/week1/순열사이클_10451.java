package com.company.study2022.week1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 순열사이클_10451 {
    static List<ArrayList<Integer>> graph;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int t = Integer.parseInt(br.readLine());
            int ans =0;
            graph = new ArrayList<>();
            visited = new boolean[t + 1];
            for (int i = 0; i <= t; i++) {
                graph.add(new ArrayList<>());
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= t; i++) {
                graph.get(i).add(Integer.parseInt(st.nextToken()));
            }
            for (int i=1; i<=t; i++){;
                if (!visited[i]){
                    ans++;
                    visited[i] = true;
                    dfs(i);
                }
            }
            bw.write(ans+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int node) {
        for (int element : graph.get(node)){
            if (!visited[element]){
                visited[element] = true;
                dfs(element);
            }
        }
    }
}
