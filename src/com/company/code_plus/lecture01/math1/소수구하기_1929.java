package com.company.code_plus.lecture01.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        boolean[] prime = new boolean[N+1];
        prime[1] = true;
        for (int k=2; k*k<=N; k++){
            if (prime[k])continue;

            for (int j=k+k; j<=N; j+=k){
                prime[j] =true;
            }
        }
        for (int i=M; i<=N; i++){
            if (!prime[i]){
                System.out.println(i);
            }
        }


    }
}
