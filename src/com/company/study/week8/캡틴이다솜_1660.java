package com.company.study.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 캡틴이다솜_1660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp [] = new int[n+1];
        int triangle [] = new int[122];
        int tetrahedron[] = new int[122];
        triangle[1] = 1;
        tetrahedron[1] =1;
        for (int i=2; i<122; i++) {
            triangle[i] += triangle[i-1] +i;
            tetrahedron[i] = tetrahedron[i-1] + triangle[i];
        }
        Arrays.fill(dp , Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 1;
       for (int i=2; i<=n; i++) {
           for (int j=1; j<122; j++) {
               if (tetrahedron[j] > i){
                   break;
               }
               dp[i] = Math.min(dp[i] , dp[i-tetrahedron[j]]+1);
            }
        }
        System.out.println(dp[n]);

    }
}
