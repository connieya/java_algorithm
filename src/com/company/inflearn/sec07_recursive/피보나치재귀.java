package com.company.inflearn.sec07_recursive;
import java.util.Scanner;
public class 피보나치재귀 {
    static long [] MEMO;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         MEMO = new long[N+1];
        for (int i =1; i<=N; i++){
            System.out.print(fibo(i)+" ");
        }
    }
    static long fibo(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            if (MEMO[n] != 0) {
                return MEMO[n];
            } else {
                return MEMO[n] = fibo(n - 1) + fibo(n - 2);
            }
        }
    }
}
