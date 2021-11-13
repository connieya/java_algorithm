package com.company.study.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수들의합_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long sum = 0;
        long count = 0;
        while (s >= sum) {
            sum += ++count;
        }
        System.out.println((s == sum )? count : count - 1);
    }
}
