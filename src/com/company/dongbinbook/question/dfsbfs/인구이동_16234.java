package com.company.dongbinbook.question.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 인구이동_16234 {
    static int land[][];
    static int temp [][];
    static int dx [] = {-1,0,1,0};
    static int dy [] = {0,1,0,-1};
    static int N,L,R;
    static int count = 0;
    static int sum =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         L = Integer.parseInt(st.nextToken());
         R = Integer.parseInt(st.nextToken());
        land = new int[N][N];
        temp = new int[N][N];
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;  j<N; j++){
                land[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                for (int k=0; k<4; k++){
                    int nx = dx[k]+i;
                    int ny = dy[k]+j;
                    if (nx>=0 && nx<N && ny>=0 && ny<N ) {
                        int abs = Math.abs(land[nx][ny] - land[i][j]);
                        if (abs >= L && abs <=R){
                            temp[nx][ny] = 1;
                        }
                    }

                }
            }
        }

    }
    public static void dfs(int x , int y){
        for (int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx>=0 && nx < N && ny >=0 && ny <N && temp[nx][ny] == 1) {
                sum += temp[nx][ny];
            }
        }
    }
}
