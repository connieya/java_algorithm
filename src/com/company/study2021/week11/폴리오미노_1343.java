package com.company.study2021.week11;

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
                if(count%2==1){
                    flag = false;
                    break;
                }else if (count%4==0){
                    for (int i=0; i<count/4; i++){
                        sb.append("AAAA");
                    }
                }else if (count%4 !=0){
                    for (int i=0; i<count/4; i++){
                        sb.append("AAAA");
                    }
                    sb.append("BB");
                }
                sb.append(".");
                count = 0;
            }else{
                count++;
            }
        }
        if (count %2 ==1){
            flag =false;
        }else if (count % 4 == 0){
            for (int i=0; i<count/4; i++){
                sb.append("AAAA");
            }
        }else if (count % 4 != 0) {
            for (int i=0; i<count/4; i++){
                sb.append("AAAA");
            }
            sb.append("BB");
        }
        if (flag){
            System.out.println(sb);
        }else{
            System.out.println(-1);
        }
    }
}
