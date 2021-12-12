package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cryptoquote_2703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String str = br.readLine();
            char alphabet[] = new char[26];
            String alpha = br.readLine();
            for (int i = 0; i < 26; i++) {
               alphabet[i] = alpha.charAt(i);
            }
            for (char ch : str.toCharArray()){
                if (Character.isAlphabetic(ch)){
                    sb.append(alphabet[ch-'A']);
                    continue;
                }
                sb.append(ch);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
