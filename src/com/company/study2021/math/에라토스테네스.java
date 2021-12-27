package com.company.study2021.math;

public class 에라토스테네스 {
    public static void main(String[] args) {
        int n = 50_000;
        boolean prime[] = new boolean[n+1];

        for (int i=2; i*i <= n; i++) {
            if (prime[i]) {
                continue;
            }
            for (int j= i+i; j<=n; j+=i){
                prime[j] = true;
            }
        }

        for (int i=2; i<=n; i++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }

    }
}
