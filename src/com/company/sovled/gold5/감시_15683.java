package com.company.sovled.gold5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 감시_15683 {
    static int n,m;
    static int office[][];
    static int board[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
         office = new int[n][m];
         board = new int[n][m];
         for (int i=0; i<n; i++){
             st = new StringTokenizer(br.readLine());
             for (int j=0; j<m; j++){
                 office[i][j] = Integer.parseInt(st.nextToken());
                 if (office[i][j] == 6){
                     board[i][j] = -1;
                 }
             }
         }

    }
}
