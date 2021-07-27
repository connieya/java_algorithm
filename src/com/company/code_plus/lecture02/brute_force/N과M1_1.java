package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class N과M1_1 {
    static boolean check[];
    static int pm[];
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        check = new boolean[n + 1];
        pm = new int[m];
        DFS(0);
    }

    static void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (!check[i]) {
                   continue;
                }
                pm[L] = i;
                check[i] = true;
                DFS(L + 1);
                check[i] = false;
            }
        }
    }
}
