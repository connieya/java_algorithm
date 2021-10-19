package com.company.study.n_m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M1 {
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
        dfs(0);
    }
    public static void dfs(int L) {
        if (L == m) {
            for (int a : arr) {
                System.out.print(a+" ");
            }
            System.out.println();
        }else {
            for (int i=1; i<=n; i++) {
                if (check[i]) {
                    continue;
                }
                arr[L] =i;
                check[i] = true;
                dfs(L+1);
                check[i] = false;
            }

        }

    }
}
