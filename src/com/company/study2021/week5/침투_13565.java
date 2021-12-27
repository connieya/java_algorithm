package com.company.study2021.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 침투_13565 {
    static int M, N;
    static int percolate[][];
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,1,0,-1};
    static String answer = "NO";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        percolate = new int[M][N];

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                percolate[i][j] = str.charAt(j) - '0';
            }
        }
        for (int j = 0; j < N; j++) {
            if (percolate[0][j] == 0) {
                search(0,j);
            }
        }
        System.out.println(answer);
    }

    public static void search(int i, int j) {
        if (i == (M-1)) {
            answer = "YES";
            return;
        }
        percolate[i][j] = 1;

        for (int k = 0; k<4; k++) {
            int nx = dx[k]+i;
            int ny = dy[k]+j;
            if (nx >=0 && nx < M && ny >=0 && ny < N && percolate[nx][ny] == 0){
                search(nx,ny);
            }
        }
    }
}
