package com.company.baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 링_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int value = arr[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            int gcd = gcd(value, arr[i]);
            sb.append(value / gcd).append("/").append(arr[i] / gcd).append("\n");
        }
        System.out.println(sb);

    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
