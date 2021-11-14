package com.company.dongbinbook.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 효율적인화폐구성 {
    static int INF = 100_000_001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int dp[] = new int[M + 1];
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = arr[i]; j <= M; j++) {
                if (dp[j - arr[i]] != INF) {
                    dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                }
            }
        }
        if (dp[M] == INF) {
            System.out.println(-1);
        }else {
            System.out.println(dp[M]);
        }
    }
}
