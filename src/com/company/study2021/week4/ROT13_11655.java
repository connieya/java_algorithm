package com.company.study2021.week4;

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
            if (Character.isUpperCase(c)) {
                c += 13;
                if (c> 90) {
                    c -= 26;
                }

            } else if (Character.isLowerCase(c)){
                c += 13;
                if (c > 122) {
                    c-= 26;
                }
            }

            sb.append(c);
        }
        System.out.println(sb);
    }
}
