package com.company.baekjoon.implement;

import java.io.*;

public class 별찍기17_10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=i; j<n-1; j++){
                sb.append(" ");
            }

            for (int j=0;  j< 2*i+1; j++) {
                if (i==n-1){
                    sb.append("*");
                    continue;
                }
                if (j==0 || j==2*i) {
                    sb.append("*");
                }else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
