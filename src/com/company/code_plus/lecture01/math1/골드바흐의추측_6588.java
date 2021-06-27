package com.company.code_plus.lecture01.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의추측_6588 {
    static boolean[] prime = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i=2; i*i<prime.length; i++){
            if (prime[i])continue;

            for (int j=i+i; j<prime.length; j+=i){
                prime[j] = true;
            }
        }
        while (true){
            int n = Integer.parseInt(br.readLine());
            if (n== 0) break;

            for (int i=2; i<=n-2; i++){
                if (!prime[i] && !prime[n-i]){
                    System.out.println(n +" = "+i+" + "+(n-i));
                    break;
                }
            }
        }
    }
}
