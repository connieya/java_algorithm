package com.company.sovled.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M6 {

    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static int result[];


    public static void dfs(int depth, int start) {
        if (depth == m) {
            for (int j : result) {
                sb.append(j).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start + 1; i < n; i++) {
            result[depth] = arr[i];
            dfs(depth + 1, i);

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[n];
        result = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0,-1);
        System.out.println(sb.toString());

    }
}
