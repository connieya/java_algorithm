package com.company.baekjoon.backtracking;
import java.util.Scanner;

public class N과M2_15650 {
    static int N,M;
    static int[] arr,check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        check = new int[N+1];
        DFS(0 ,1);
    }
    static void DFS(int L,int S){
        if (L==M){
            for (int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }else {
            for (int i=S; i<=N; i++){
                if (check[i]==0){
                    check[i] =1;
                    arr[L]= i;
                    DFS(L+1, i+1);
                    check[i] =0;
                }
            }
        }
    }
}

