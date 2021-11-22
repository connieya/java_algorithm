package com.company.study.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 투명_1531 {
    public static void main(String[] args) throws IOException {
        int draw[][] = new int[101][101];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count =0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int i = Math.min(x1,x2); i<=Math.max(x1,x2); i++){
                for (int j= Math.min(y1,y2); j<=Math.max(y1,y2); j++) {
                    draw[i][j]++;
                }
            }
        }
        for (int i=0; i<101; i++){
            for (int j=0; j<101; j++){
                if (draw[i][j] > M){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
