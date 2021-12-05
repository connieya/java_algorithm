package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 임시반장정하기_1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int students[][] = new int[n+1][n+1];
        for (int i=1;i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=1; j<=5; j++){
                students[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = -1;
        int answer = 0;
        for (int i=1; i<=n; i++) {
            int count = 0;
            for (int j=1; j<=n; j++){
                for (int k=1; k<=5; k++) {
                    if (i==j){
                        continue;
                    }
                    if (students[i][k] == students[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if (count > max){
                max = count;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
