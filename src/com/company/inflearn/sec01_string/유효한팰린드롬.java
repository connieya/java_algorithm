package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유효한팰린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        str = str.replaceAll("[^0-9a-z]", "");
        String answer = "YES";
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
        br.close();
    }
}
