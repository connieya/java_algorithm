package com.company.sovled.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 결혼식 {

    static List<List<Integer>> graph = new ArrayList<>();
    static int dis[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        dis = new int[n+1];

        for (int i=0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i=0; i< m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(1,-1);

        int ans = 0;
        for (int i=2; i<=n; i++) {
            if (dis[i] !=0 && dis[i] <= 2) ans++;
        }

        System.out.println(ans);
    }

    public static void dfs(int start , int prev) {
        for (int nxt: graph.get(start)) {
            if (prev == nxt || nxt == 1) continue;
            if (dis[nxt] == 0 || dis[start]+1 < dis[nxt] ) {
                dis[nxt] = dis[start]+1;
                dfs(nxt , start);
            }
        }
    }
}
