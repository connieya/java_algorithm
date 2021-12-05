package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 명령프롬포트_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String init = br.readLine();
        char[] initArray = init.toCharArray();
        n--;
        while (n-- > 0){
            String input = br.readLine();
            int len = input.length();
            for (int i=0; i<len; i++){
                if (initArray[i] != input.charAt(i)){
                    initArray[i] = '?';
                }
            }
        }
        System.out.println(String.valueOf(initArray));
    }
}
