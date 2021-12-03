package com.company.study.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 호텔방번호_5671 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int i = N; i <= M; i++) {
                int arr[] = new int[10];
                String temp = String.valueOf(i);
                boolean flag = true;
                for (char ch : temp.toCharArray()){
                    arr[ch-'0']++;
                }
                for (int a : arr){
                    if (a > 1){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
