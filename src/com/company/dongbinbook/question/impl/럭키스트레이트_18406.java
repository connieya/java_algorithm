package com.company.dongbinbook.question.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 럭키스트레이트_18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        int sum = 0;
        for (int i=0; i<len; i++){
            if (i < len/2){
                sum += str.charAt(i);
            }else{
                sum -= str.charAt(i);
            }
        }
        String answer = sum == 0 ? "LUCKY" : "READY";
        System.out.println(answer);
    }
}
