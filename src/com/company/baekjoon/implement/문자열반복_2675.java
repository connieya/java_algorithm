package com.company.baekjoon.implement;

import java.io.*;
import java.util.StringTokenizer;

public class 문자열반복_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- >0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for (char ch : str.toCharArray()){
                for (int i=0; i<r; i++){
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }

    }
}
