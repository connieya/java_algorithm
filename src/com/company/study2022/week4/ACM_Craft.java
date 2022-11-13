package com.company.study2022.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM_Craft {
    static int time[];
    static int N,M,W;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            time = new int[N+1];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<N; i++){
                time[i] = Integer.parseInt(st.nextToken());
            }

        }
    }
}
