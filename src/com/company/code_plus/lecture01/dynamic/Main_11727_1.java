package com.company.code_plus.lecture01.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11727_1 {
    static int memo[];

    public static int tiling(int n){
        if (n==1) return 1;
        if (n==2) return 3;
        if (memo[n] >0){
            return memo[n];
        }else {
            return tiling(n-1) + tiling(n-2)*2;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new int[n+1];
        System.out.println(tiling(n));


    }
}
