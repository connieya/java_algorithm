package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                sb.append(1);
            } else {
                sb.append(0);
            }
            if ((i + 1) % 7 == 0) {
                int sum = 0;
                for (int j = 0; j < 7; j++) {
                    if (sb.toString().charAt(j) == '1'){
                        sum += Math.pow(2 , 6-j);
                    }
                }
                answer.append((char)sum);
                sb = new StringBuilder();
            }
        }
        System.out.println(answer);
    }
}
