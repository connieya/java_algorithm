package com.company.dongbinbook.dp;

import java.util.Scanner;

public class 일로만들기 {
    static int[] dp = new int[30_001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        for (int i = 2; i <= X; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            if (i % 4 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 4] + 1);
            }
        }
        System.out.println(dp[X]);
    }

}

