package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class N과M3 {
    static int n,m;
    static int[] pm;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        m =sc.nextInt();
        pm =  new int[m];
        go(0);
        System.out.println(sb);
    }
    static void go(int L){
        if (L==m){
            for (int c : pm){
                sb.append(c).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=1; i<=n; i++){
            pm[L] = i;
            go(L+1);
        }
    }
}
