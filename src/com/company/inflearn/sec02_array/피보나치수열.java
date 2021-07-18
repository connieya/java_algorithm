package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 피보나치수열 {
    static int[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        memo = new int[N+1];
        for (int i=1; i<=N; i++){
            System.out.print(fibo(i)+" ");
        }
    }
    static int fibo(int n){
        if (n==1) return 1;
        if (n==2) return 1;
        else {
            if (memo[n] != 0){
                return memo[n];
            }else {
                return memo[n] = fibo(n-1)+ fibo(n-2);
            }
        }
    }
}

