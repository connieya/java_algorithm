package com.company.study.week10;

import java.io.*;
import java.util.StringTokenizer;

public class MaximumSubarray_10211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            int arr[] = new int[a+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= a; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int dp[] = new int[a+1];
            int answer = Integer.MIN_VALUE;
            for (int i = 1; i <= a; i++) {
                dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
                answer = Math.max(dp[i] ,answer);
            }
            sb.append(answer).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
