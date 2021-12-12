package com.company.study.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 극장좌석_2302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n+1];
        dp[0] =1;
        dp[1] =1;
        dp[2] = 2;
        int m = Integer.parseInt(br.readLine());
        int vip[] = new int[m];
        for (int i=0; i<m; i++){
            vip[i] = Integer.parseInt(br.readLine());
        }
        for (int i=3; i<=n; i++){
            dp[i] = dp[i-1] +dp[i-2];
        }
        int start = 0;
        int answer =1;
        for (int i=0; i<m; i++){
            int num = vip[i] -start-1;
            answer *= dp[num];
            start = vip[i];
        }
        answer *= dp[n-start];
        System.out.println(answer);

    }
}
