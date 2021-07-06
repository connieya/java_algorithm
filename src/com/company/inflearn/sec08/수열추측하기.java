package com.company.inflearn.sec08;

import java.util.Scanner;

public class 수열추측하기 {
    static int N,F;
    static int array[][];
    static int permutation[], answer[];
    static boolean [] check;
    static boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         F = sc.nextInt();
        array = new int[N][N];
        permutation = new int[N];
        for (int i=0; i<N; i++){
            permutation[i] = DFS(N-1,i);
        }
        check = new boolean[N+1];
        answer = new int[N];
        sequence(0,0);
    }
    static int DFS(int n, int r){
        if (n==r || r==0) return 1;
        else {
            if (array[n][r] !=0){
                return array[n][r];
            }else {
                return array[n][r] = DFS(n-1,r-1)+DFS(n-1,r);
            }
        }
    }
    static void sequence(int L , int sum){
        if (flag) return;
        if (L==N){
            if (sum==F){
                for (int x : answer) System.out.print(x+" ");
                flag =true;
            }
        }else {
            for (int i=1; i<=N; i++){
                if (!check[i]){
                    check[i] = true;
                    answer[L] = i;
                    sequence(L+1, sum+(answer[L]*permutation[L]));
                    check[i] = false;
                }
            }
        }
    }
}
