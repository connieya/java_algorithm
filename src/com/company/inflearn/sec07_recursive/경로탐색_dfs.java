package com.company.inflearn.sec07_recursive;

import java.util.Scanner;

public class 경로탐색_dfs {
    static int n, m;
    static int[][] arr;
    static boolean ck[];
    static int count =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ck = new boolean[n + 1];
        arr = new int[n + 1][n + 1];
        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
        }
        DFS(1);
        System.out.println(count);
    }

    static void DFS(int L) {
        if (L==n){
            count++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (arr[L][i] == 1 && !ck[L]) {
                ck[L] = true;
                DFS(i);
                ck[L] = false;
            }
        }
    }
}
