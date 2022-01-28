package com.company.study2022.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 트리_1086 {
    static List<ArrayList<Integer>> tree = new ArrayList<>();
    static int e;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<=n; i++) {
            tree.add(new ArrayList<>());
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int root = 0;
        for (int i=0; i<n; i++){
            int v = Integer.parseInt(st.nextToken());
            if (v == -1){
                root = i;
                continue;
            }
            tree.get(v).add(i);
        }
         e = Integer.parseInt(br.readLine());
        if (e == root) {
            System.out.println(0);
        }else {
            System.out.println(dfs(root));
        }
    }

    static int dfs(int root) {
        int child = 0;
        int leaf = 1;
        for (int c : tree.get(root)) {
            if (c == e) continue;
            child += dfs(c);
        }

        if (child > 0) return child;
        else return leaf;
    }
}
