package com.company.baekjoon.backtracking;

import java.util.Scanner;

public class N과M_15649 {
    static int N,M;
    static int[] arr,check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        check = new int[N+1];
        DFS(0);
    }
    static void DFS(int L){
        if (L==M){
            for (int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }else {
            for (int i=1; i<=N; i++){
                if (check[i]==0){
                    check[i] =1;
                    arr[L]= i;
                    DFS(L+1);
                    check[i] =0;
                }
            }
        }
    }
}

