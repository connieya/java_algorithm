package com.company.study.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 접미사배열_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String stGroup [] = new String[s.length()];
        int len = s.length();
        for (int i=0; i<len; i++) {
            stGroup[i] = s.substring(i);
        }
        Arrays.sort(stGroup);
        StringBuilder sb = new StringBuilder();
        for (String str : stGroup) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
