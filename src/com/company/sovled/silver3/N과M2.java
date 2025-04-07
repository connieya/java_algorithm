package com.company.sovled.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M2 {

    static int n, m;
    static int[] arr;


    public static void dfs(int depth, int start) {
        if (depth == m) {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start + 1; i <= n; i++) {
            arr[depth] = i;
            dfs(depth + 1, i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(0,0);

    }
}
