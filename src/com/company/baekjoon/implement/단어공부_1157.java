package com.company.baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        int []alpha = new int[26];
        for (char ch : input.toCharArray()){
            alpha[ch-'A']++;
        }
        int max = Arrays.stream(alpha).max().getAsInt();
        char answer = 0;
        int count = -1;
        for (int i=0; i<26; i++){
            if (alpha[i] == max){
                answer = (char)( i+'A');
                count++;
            }
        }
        if (count >0){
            System.out.println("?");
        }else{
            System.out.println(answer);
        }

    }
}
