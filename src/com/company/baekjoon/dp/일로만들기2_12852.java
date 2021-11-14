package com.company.baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일로만들기2_12852 {
    static int dp[] = new int[1_000_001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        for (int i = 2; i <= X; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dp[X]).append("\n");
        int index = dp[X];
        for (int i = X; i >= 1; i--) {
            if (index == dp[i]) {
                sb.append(i).append(" ");
            }
            if (dp[i] - 1 == dp[i - 1]) {
            } else if (i % 2 == 0 && dp[i] - 1 == dp[i / 2]) {
                i = i/2 +1 ;
            } else if (i % 3 == 0 && dp[i] - 1 == dp[i / 3]) {
                i = i/3 +1 ;
            }
            index--;
        }
        System.out.println(sb);
    }
}
