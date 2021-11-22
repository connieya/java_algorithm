package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine().toLowerCase();
        char s = br.readLine().toLowerCase().charAt(0);
        int count = 0;
        for (char ch : str.toCharArray()){
            if (ch == s){
                count++;
            }
        }
        System.out.println(count);
    }
}
