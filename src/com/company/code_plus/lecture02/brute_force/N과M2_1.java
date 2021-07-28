package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class N과M2_1 {
    static int n, m;
    static int[] answer;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        check = new boolean[n + 1];
        DFS(0, 1);
        System.out.println(sb);
    }

    static void DFS(int L, int start) {
        if (L == m) {
            for (int c : answer) {
                sb.append(c).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            answer[L] = i;
            DFS(L + 1, i + 1);
        }
    }
}
