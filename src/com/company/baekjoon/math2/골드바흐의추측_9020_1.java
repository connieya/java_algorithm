package com.company.baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의추측_9020_1 {
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
            int p = n/2;
            int q = n/2;
            while (true){
                if (!prime[p] && !prime[q]){
                    System.out.println(p+" "+q);
                    break;
                }
                p--;
                q++;

            }

        }
    }
}
