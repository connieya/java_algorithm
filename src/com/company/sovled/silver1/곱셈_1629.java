package com.company.sovled.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 곱셈_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
        System.out.println(pow(A, B, C));
    }

    public static long pow(long a, long b, long c) {
        if (b == 1) {
            return a % c;
        }
        long val = pow(a, b / 2, c);
        val = val * val % c;
        if (b % 2 == 0) return val;
        return val * a % c;
    }
}
