package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 소수_에라토스테네스체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean prime[] = new boolean[N + 1];
        prime[1] = true;
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) continue;
            else {
                for (int j = i + i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!prime[i]) count++;
        }
        System.out.println(count);
    }
}
