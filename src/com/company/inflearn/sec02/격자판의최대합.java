package com.company.inflearn.sec02;

import java.util.Scanner;

public class 격자판의최대합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int board[][] =new int[N][N];
        int max = Integer.MIN_VALUE;
        int sum =0;
        for (int i=0; i<N; i++){
             sum = 0;
            for (int j=0; j<N; j++){
                board[i][j] = sc.nextInt();
                sum += board[i][j];
            }
            max = Math.max(max, sum);
        }
        int diagonal =0 , diagonal2= 0;
        for (int i=0; i<N; i++){
            sum=0;
            for (int j=0; j<N; j++){
                sum += board[j][i];

            }
            max = Math.max(max,sum);
            diagonal2 +=board[i][i];
            diagonal += board[N-1-i][i];
        }
        max = Math.max(max , diagonal);
        max = Math.max(max,diagonal2);
        System.out.println(max);
    }
}
