package com.company.study.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 학급회장 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String student = br.readLine();
        String str = br.readLine();
        int alpha[] = new int[26];
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            int a = ch-'A';
            alpha[a]++;
        }
        int max = Integer.MIN_VALUE;
        int count =0;
        for (int i=0; i<26; i++){
            if (max < alpha[i]) {
                max = alpha[i];
                count = i;
            }
        }
        int answer = count+'A';
        System.out.println((char)answer);
    }
}
