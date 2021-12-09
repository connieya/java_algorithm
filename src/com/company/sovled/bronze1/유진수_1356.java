package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유진수_1356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String answer = "NO";
        for (int i = 0; i < num.length() - 1; i++) {
            int a = 1;
            for (int j = 0; j <= i; j++) {
                a *= (num.charAt(j) - '0');
            }
            int b = 1;
            for (int k = i + 1; k < num.length(); k++) {
                b *= (num.charAt(k) - '0');
            }
            if (a == b) {
                answer = "YES";
                break;
            }
        }
        System.out.println(answer);
    }
}
