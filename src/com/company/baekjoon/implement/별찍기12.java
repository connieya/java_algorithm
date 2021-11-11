package com.company.baekjoon.implement;

import java.io.*;

public class 별찍기12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        char[] star = new char[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            star[i] = ' ';
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                star[n - 1 - j] = '*';
            }
            bw.write(String.valueOf(star));
            bw.write("\n");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                star[j] = ' ';
            }
            bw.write(String.valueOf(star));
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
