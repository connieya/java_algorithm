package com.company.baekjoon.implement;

import java.io.*;

public class 별찍기13_2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }
        for (int i=0; i<n-1; i++) {
            for (int j=i; j<n-1;j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
