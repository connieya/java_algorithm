package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 특정문자뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char chars [] = str.toCharArray();
        int lt = 0;
        int rt = chars.length-1;
        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])){
                lt++;
            }else if (!Character.isAlphabetic(chars[rt])){
                rt--;
            }else {
                char temp = chars[rt];
                chars[rt] = chars[lt];
                chars[lt] = temp;
                lt++;
                rt--;
            }
        }
        System.out.println(String.valueOf(chars));
    }
}
