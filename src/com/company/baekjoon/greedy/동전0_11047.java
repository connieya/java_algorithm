package com.company.baekjoon.greedy;

import java.util.Scanner;

public class 동전0_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int coin[] = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        int count = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (k == 0) break;
            if (coin[j] > k) {
                continue;
            }
            count += k / coin[j];
            k = k % coin[j];
        }
        System.out.println(count);
    }
}
