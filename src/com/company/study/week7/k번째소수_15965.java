package com.company.study.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class k번째소수_15965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int n = 10_000_000;
        boolean prime[] = new boolean[n+1];
        prime[1] = true;
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                continue;
            }
            if (++count == K) {
                System.out.println(i);
                break;
            }
            for (int j = i + i; j <= n; j += i) {
                prime[j] = true;
            }
        }

    }
}
