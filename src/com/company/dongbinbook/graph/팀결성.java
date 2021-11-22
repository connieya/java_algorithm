package com.company.dongbinbook.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 팀결성 {
    static int parent[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int print = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (print == 0) {
                union(a,b);
                continue;
            }
            if (find(a) == find(b)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static int find(int x) {
        if (x == parent[x]){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    public static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if ( a < b){
            parent[b] = a;
            return;
        }
        parent[a] = b;
    }
}
