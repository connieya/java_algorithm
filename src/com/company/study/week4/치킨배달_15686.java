package com.company.study.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 치킨배달_15686 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int city[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int j=0;
                for (String str : split){
                    city[i][j++] = Integer.parseInt(str);
                }

        }


    }
}
