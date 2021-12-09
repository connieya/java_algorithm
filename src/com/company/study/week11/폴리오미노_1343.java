package com.company.study.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 폴리오미노_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        StringBuilder sb = new StringBuilder();
        int count =0;
        boolean flag = true;
        for (char ch : board.toCharArray()) {
            if (ch == '.') {
                if (count == 2){
                    sb.append("BB").append(ch);
                }else if (count == 4) {
                    sb.append("AAAA").append(ch);
                }else if (count == 0){
                   sb.append(ch);
                }else {
                    flag = false;
                    System.out.println(-1);
                    break;
                }
                count =0;
            }
            count++;
            if (count == 4) {
                sb.append("AAAA");
                count = 0;
            }
        }
        if (count == 4) {
            sb.append("AAAA");
        }else if (count == 2){
            sb.append("BB");
        }else {
            flag = false;
            System.out.println(-1);
        }
        if (flag){
            System.out.println(sb);
        }
    }
}
