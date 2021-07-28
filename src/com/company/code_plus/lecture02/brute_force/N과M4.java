package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class N과M4 {
    static int n,m;
    static int[] pm;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        dfs(0,1);
        System.out.println(sb);
    }

    static void dfs(int L, int start){
        if (L==m){
            for (int c: pm){
                sb.append(c).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i= start; i<=n; i++){
            pm[L] =i;
            dfs(L+1,i);
        }

    }
}
