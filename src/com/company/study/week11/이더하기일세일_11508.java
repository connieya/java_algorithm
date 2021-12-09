package com.company.study.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 이더하기일세일_11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int shopping[] = new int[n];
        for (int i=0; i<n; i++){
            shopping[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(shopping);
        int saleCount = n /3;
        long sum = 0;
        for (int i = 0; i<n; i++){
            if (i % 2 ==0 && saleCount-- >0 ){
                continue;
            }
            sum += shopping[i];
        }
        System.out.println(sum);
    }
}
