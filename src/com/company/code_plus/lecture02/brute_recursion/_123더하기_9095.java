package com.company.code_plus.lecture02.brute_recursion;

import java.util.Scanner;

public class _123더하기_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(go(n, 0));
        }

    }

    static int go(int n, int sum) {
        if (sum > n) {
            return 0;
        }
        if (sum == n) {
            return 1;
        }
        int now = 0;
        for (int i = 1; i <= 3; i++) {
            now += go(n, sum + i);
        }
        return now;
    }
}
