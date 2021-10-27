package com.company.study.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 성지키기_1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char castle[][] = new char[N][M];
        int row = 0;
        int column = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            boolean flag = true;
            for (int j = 0; j < M; j++) {
                castle[i][j] = str.charAt(j);
                if (castle[i][j] =='X') {
                    flag = false;
                }
            }
            if (flag) {
                row++;
            }
        }
        for (int i=0; i<M; i++) {
            boolean flag = true;
            for (int j=0; j<N; j++) {
                if (castle[j][i] == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag)  {
                column++;
            }
        }
        System.out.println(Math.max(row,column));
    }

}
