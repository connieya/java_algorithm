package com.company.inflearn.sec07_recursive;

import java.util.Scanner;

public class 부분집합구하기_DFS {
    static int n;
    static boolean check[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        check = new boolean[n + 1];
        dfs(1);
    }

    static void dfs(int L) {
        if (L == n) {
            for (int i=0; i< check.length; i++) {
                if (check[i]){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            check[L] = true;
            dfs(L + 1);
            check[L] = false;
        }
    }

}
