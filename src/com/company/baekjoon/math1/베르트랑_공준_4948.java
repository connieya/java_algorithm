package com.company.baekjoon.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 베르트랑_공준_4948 {
    static boolean prime[] = new boolean[250000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        prime[1] = true;
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) continue;
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
        while (true){
            int n = Integer.parseInt(br.readLine());
            if (n==0){
                break;
            }

            System.out.println(count(n));
        }

    }

    static int count(int n){
        int count = 0;
        for (int i=n+1; i<=2*n; i++){
            if (!prime[i]){
                count++;
            }
        }
        return count;
    }
}
