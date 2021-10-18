package com.company.study.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    int i = c + 13;
                    if (i > 90) {
                        sb.append((char) (i - 26));
                    } else {
                        sb.append((char) i);
                    }
                } else {
                    int i = c + 13;
                    if (i > 122) {
                        sb.append((char) (i - 26));
                    } else {
                        sb.append((char) i);
                    }
                }

            } else {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
