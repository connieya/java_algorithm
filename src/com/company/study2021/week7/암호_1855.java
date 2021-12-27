package com.company.study2021.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호_1855 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int len = str.length();
        char answer[][] = new char[len / k][k];
        int l = 0;
        for (int i = 0; i < len / k; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < k; j++) {
                    answer[i][j] = str.charAt(l++);
                }
            } else {
                for (int j = k - 1; j >= 0; j--) {
                    answer[i][j] = str.charAt(l++);
                }
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < len / k; j++) {
                sb.append(answer[j][i]);
            }
        }
        System.out.println(sb);
    }
}
