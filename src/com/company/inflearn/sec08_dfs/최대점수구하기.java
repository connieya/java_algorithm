package com.company.inflearn.sec08_dfs;

import java.util.Scanner;

public class 최대점수구하기 {
    static int N,M,answer =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         M = sc.nextInt();
         int array[][] = new int[N][2];
         for (int i= 0; i<N; i++){
             array[i][0] = sc.nextInt();
             array[i][1] = sc.nextInt();
         }
         DFS(0,0,0,array);
        System.out.println(answer);
    }
    static void DFS(int L, int t ,int s, int arr[][]){
        if (t>M) return;
        if (L == N){
            answer =Math.max(s,answer);
            return;

        }else {
            DFS(L+1, t+arr[L][1],s+arr[L][0] ,arr);
            DFS(L+1,t,s,arr);
        }
    }
}
