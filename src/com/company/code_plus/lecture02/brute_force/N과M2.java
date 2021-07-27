package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class N과M2 {
    static int n, m;
    static int[] answer;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        check = new boolean[n+1];
        DFS(0,1);
    }

    static void DFS(int L, int start) {
        if (L==m){
            for (int c : answer){
                System.out.print(c+" ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            if (check[i]) {
                continue;
            }
            answer[L] = i;
            check[i] = true;
            DFS(L + 1, i + 1);
            check[i] = false;
        }
    }
}
