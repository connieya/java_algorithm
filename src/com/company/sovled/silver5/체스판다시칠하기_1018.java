package com.company.sovled.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean board[][] = new boolean[N][M]; // B => true , W => false;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if(str.charAt(j) =='B'){
                    board[i][j] =true;
                }
            }
        }
        int x = N - 8, y = M - 8;
        int i = 0, j = 0;
        int min = 32;
        for (int m = 0; m <= x; m++) {
            for (int k = 0; k <= y; k++) {
                int count = 0;
                boolean flag = board[m+0][k+0];
                for (i = m; i < 8 + m; i++) {
                    for (j = k; j < 8 + k; j++) {
                        if(flag != board[i][j]){
                            count++;
                        }
                        flag = !flag;
                    }
                    flag = !flag;
                }
                count = Math.min(count,64-count);
                min = Math.min(min,count);
            }
        }
        System.out.println(min);
    }
}
