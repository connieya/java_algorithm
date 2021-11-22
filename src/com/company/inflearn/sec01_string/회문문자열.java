package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        if (str.equals(new StringBuilder(str).reverse().toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
