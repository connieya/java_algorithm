package com.company.inflearn.c1_impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의총개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count =0;
        for (int i=1; i<=n; i++){
            int temp = i;
            while (temp>0){
                temp/=10;
                count++;
            }
        }
        System.out.println(count);
    }
}
