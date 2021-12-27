package com.company.study2021.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열분석_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input =br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = input.toCharArray();
            int info[] = new int[4];
            for (char ch : charArray) {
                if (Character.isAlphabetic(ch)) {
                    if (Character.isUpperCase(ch)) {
                        info[1]++;
                    } else {
                        info[0]++;
                    }

                } else if (Character.isDigit(ch)) {
                    info[2]++;
                } else {
                    info[3]++;
                }
            }
            for (int arr : info) {
                sb.append(arr).append(" ");
            }
            System.out.println(sb);
        }
    }
}
