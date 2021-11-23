package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자만추출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for (char ch : str.toCharArray()){
            if (Character.isDigit(ch)){
               answer = answer*10 + (ch-'0');
            }
        }
        System.out.println(answer);
    }

}
