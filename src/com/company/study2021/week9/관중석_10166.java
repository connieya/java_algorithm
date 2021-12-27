package com.company.study2021.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 관중석_10166 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer =0;
        boolean isVisited[][] = new boolean[2001][2001];
        for (int i= n; i<=m; i++){
            for (int j=1; j<=i; j++){
                int gcd = gcd(i,j);
                int x = i / gcd;
                int y = j / gcd;
                if (!isVisited[x][y]){
                    answer++;
                    isVisited[x][y] = true;
                }
            }
        }
        System.out.println(answer);
    }

    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a%b);
    }
}
