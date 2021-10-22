package com.company.study.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알파벳찾기_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char[] charArray = S.toCharArray();
        int [] alphabet = new int[26];
        Arrays.fill(alphabet,-1);
        for (char c : charArray) {
            alphabet[c-97] = S.indexOf(c);
        }
        for (int arr : alphabet) {
            System.out.print(arr+" ");
        }
    }
}
