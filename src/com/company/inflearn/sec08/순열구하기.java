package com.company.inflearn.sec08;

import java.util.Scanner;

public class 순열구하기 {
    static int N, M;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int pm[] = new int[M];
        check = new boolean[N];
        DFS(0,arr,pm);
    }
    static void DFS(int L, int[] arr, int[] pm) {
        if (L == M) {
            for (int x : pm){
                System.out.print(x+" ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < N; i++){
                if (!check[i]){
                    check[i] = true;
                    pm[L] = arr[i];
                    DFS(L+1,arr,pm);
                    check[i] = false;
                }
            }
        }
    }
}
