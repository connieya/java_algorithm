package com.company.baekjoon.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2231_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        int result =0;
        for (int i=1; i<n; i++){

            int sum = 0;
            int num = i;
            while (num !=0){
                sum += num%10;
                num /= 10;

            }
            if (sum+i == n){
                result =i;
                break;
            }
        }
        System.out.println(result);
    }
}
