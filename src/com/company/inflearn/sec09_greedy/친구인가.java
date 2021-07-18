package com.company.inflearn.sec09_greedy;

import java.util.Scanner;

public class 친구인가 {
    static int [] unf;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        unf = new int[N+1];
        for (int i=1; i<=N; i++) unf[i] = i;
        for (int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a,b);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if (fa==fb){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
    static void Union(int a , int b){
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }
    static int Find(int v){
        if (v==unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }
}
