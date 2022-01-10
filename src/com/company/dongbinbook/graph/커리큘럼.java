package com.company.dongbinbook.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class 커리큘럼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int degree[] = new int[n+1];
        int tt[] = new int[n+1];
        int ans[] = new int[n+1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        for (int i=1; i<=n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            tt[i] = time;
            ans[i] = time;
            while (st.hasMoreElements()){
                int v = Integer.parseInt(st.nextToken());
                if (v!=-1){
                    degree[i]++;
                    graph.get(v).add(i);
                }
            }

        }
        Queue<Integer> Q = new LinkedList<>();
        for (int i=1; i<=n; i++){
            if (degree[i] == 0){
                Q.add(i);
            }
        }
        while (!Q.isEmpty()) {
            int now = Q.poll();
            for (int next : graph.get(now)){
                ans[next] = Math.max(ans[next], ans[now]+tt[next]);
                degree[next]--;
                if (degree[next] == 0){
                    Q.add(next);
                }
            }
        }
        for (int i=1; i<=n; i++){
            System.out.println(ans[i]);
        }

    }
}
