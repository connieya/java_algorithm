package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class N과M1 {
    static boolean check[];
    static int answer [];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        check = new boolean[N+1];
        answer = new int[M+1];
        go(0,N,M);
        System.out.println(sb);
    }
    static void go(int index , int n, int m){
        if (index == m){
            for (int i=0; i<m; i++){
                sb.append(answer[i]);
                if(i != m-1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=1; i<=n; i++){
            if (check[i]) continue;
            check[i] = true;
            answer[index] = i;
            go(index+1, n,m);
            check[i] = false;
        }
    }
}
