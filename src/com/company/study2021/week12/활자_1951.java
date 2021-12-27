package com.company.study2021.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 활자_1951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0, digit = 9, c = 1, ans = 0;
        while (sum + digit < n) {
            sum = (sum + digit);
            ans = (ans + (c * digit));
            digit = (digit*10);
            c++;
        }
        ans = (ans + (n - sum) * c) % 1234567;
        System.out.println(ans);
    }
}
