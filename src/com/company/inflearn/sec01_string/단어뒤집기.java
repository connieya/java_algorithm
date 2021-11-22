package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String str= new StringBuilder(br.readLine()).reverse().toString();
            System.out.println(str);
        }
    }
}
