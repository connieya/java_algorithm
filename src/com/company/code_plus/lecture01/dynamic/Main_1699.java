package com.company.code_plus.lecture01.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        while ((int)Math.sqrt(n) != 1){
            int sqrt = (int) Math.sqrt(n);
            n = n - (sqrt*sqrt);
            count++;
        }
        while (n-1 !=0){
            n = n-1;
            count++;
        }
        count++;
        System.out.println(count);
    }
}
