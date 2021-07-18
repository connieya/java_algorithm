package com.company.inflearn.sec08_dfs;

import java.util.Scanner;

public class 조합구하기 {
    static int N,M;
    static boolean[] check;
    static int [] answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        answer= new int[M];
        check = new boolean[N+1];
        DFS(0, 1);
    }
    static void DFS(int L , int s){
        if (L==M){
            for (int x : answer){
                System.out.print(x+" ");
            }
            System.out.println();
        }else {
            for (int i=s; i<=N;i++){
                answer[L] = i;
                DFS(L+1, i+1);
            }
        }

    }
}
