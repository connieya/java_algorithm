package com.company.code_plus.lecture01.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _123더하기_15990 {
    static final long MOD = 1000_000_009L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long arr[][] = new long[100_001][4];
        arr[1][1] = 1;
        arr[2][2] = 1;
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[3][3] = 1;
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 4; i <= n; i++) {
                arr[i][1] = (arr[i - 1][2] + arr[i - 1][3]) % MOD;
                arr[i][2] = (arr[i - 2][1] + arr[i - 2][3]) % MOD;
                arr[i][3] = (arr[i - 3][1] + arr[i - 3][2]) % MOD;
            }
            System.out.println((arr[n][1] + arr[n][2] + arr[n][3]) % MOD);
        }
    }
}
