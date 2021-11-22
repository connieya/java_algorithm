package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()){
            if (Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
                continue;
            }
            sb.append(Character.toUpperCase(ch));
        }
        System.out.println(sb);

    }
}
