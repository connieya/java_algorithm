package com.company.baekjoon.while_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1110_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = n;
        do {
            copy= ( (copy%10)*10) + ( ((copy/10) +(copy%10)) %10);
            cnt++;
        }while (copy!=n);

        System.out.println(cnt);
    }
}
