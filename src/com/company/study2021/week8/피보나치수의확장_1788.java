package com.company.study2021.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수의확장_1788 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int abs = Math.abs(n);
        int fibo[] = new int[1000_001];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= abs; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1000_000_000;
        }
        if (n == 0) {
            System.out.println(0);
            System.out.println(0);
        } else if (n < 0) {
            if (n % 2 == 0) {
                System.out.println(-1);
            } else {
                System.out.println(1);
            }
            System.out.println(fibo[abs]);
        } else {
            System.out.println(1);
            System.out.println(fibo[n]);
        }

    }
}
