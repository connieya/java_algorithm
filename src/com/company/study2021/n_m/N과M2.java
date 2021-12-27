package com.company.study2021.n_m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M2 {
    static int n, m;
    static int arr[];
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        check = new boolean[n+1];
        dfs(0,1);
    }
    public static void dfs(int L , int start) {
        if (L == m) {
            for (int a : arr) {
                System.out.print(a+" ");
            }
            System.out.println();
        }else {
            for (int i= start; i<=n; i++) {
                arr[L] =i;
                dfs(L+1 ,i+1);

            }

        }

    }
}
