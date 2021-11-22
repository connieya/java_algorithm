package com.company.dongbinbook.question.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱하기혹은더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = s.charAt(0)-'0';
        // 풀이 1
        /*for (int i=1; i<s.length(); i++){
            int num = s.charAt(i) - '0';
            result = Math.max(result*num , result+num);
        }*/
        // 풀이 2
        for (int i=1; i<s.length(); i++){
            int num = s.charAt(i)-'0';
            if (num <= 1 || result <= 1){
                result += num;
            }else{
                result *= num;
            }
        }
        System.out.println(result);
    }
}
