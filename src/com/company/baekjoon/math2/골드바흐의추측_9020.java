package com.company.baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의추측_9020 {
    static boolean prime[] = new boolean[10000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i =2; i*i<prime.length; i++){
            if (prime[i]) continue;
            for (int j= i+i; j<prime.length; j+=i){
                prime[j] = true;
            }
        }
        int T = Integer.parseInt(br.readLine());
        while (T-- >0){
            int n = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE;
            int c = 0;
            int d = 0;
            for (int j= (int)Math.sqrt(n); j<n; j++){
                if (!prime[j] && !prime[n-j]){
                    if (min > Math.abs(j -(n-j))){
                        min = Math.abs(j -(n-j));
                        c = j;
                        d = n-j;
                    }
                }
            }
            System.out.println(c+" "+d);

        }
    }
}
