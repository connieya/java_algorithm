package com.company.sovled.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 서로다른부분문자열의개수_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = new String[s.length()];
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            str[i] = s.substring(i);
        }
        Arrays.sort(str);
        answer += str[0].length();

    }
}
