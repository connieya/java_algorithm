package com.company.study2021.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주몽_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] elementArray = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreElements()) {
            elementArray[i++] = Integer.parseInt(st.nextToken());
        }
        int answer =0;
        int sum =0;
        for (int start =0; start <n; start++) {
            int end = start+1;
            while (end < n) {
               sum = elementArray[start];
               sum += elementArray[end];
               if (sum == m){
                   answer++;
               }
               end++;
            }
        }
        System.out.println(answer);
    }
}
