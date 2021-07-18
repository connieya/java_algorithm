package com.company.inflearn.sec08_dfs;
import java.util.Scanner;

public class 동전교환 {
    static int N,M , answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int pm[] = new int[N];
        for (int i=0; i<N; i++){
            pm[i] = sc.nextInt();
        }
        M = sc.nextInt();;

        DFS(0,0, pm);
        System.out.println(answer);
    }
    static void DFS(int L , int sum , int[]pm){
        if (sum > M) return;
        if (L>=answer) return;
        if (sum == M){
            answer = Math.min(answer,L);
        }else{
            for (int i=N-1; i>=0; i--){
                DFS(L+1, sum+pm[i],pm);
            }
        }
    }
}
