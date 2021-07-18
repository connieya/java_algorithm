package com.company.inflearn.sec08_dfs;

import java.util.Scanner;
public class 섬나라아일랜드 {
    static int N ,count = 0;
    static int island[][];
    static int bx [] = {-1,-1,0,1,1,1,0,-1};
    static int by [] = {0,1,1,1,0,-1,-1,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        island = new int[N][N];
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                island[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                if (island[i][j] == 1){
                    DFS(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static void DFS(int i, int j){
        for (int k=0; k<8; k++){
            int nx = i +bx[k];
            int ny = j+ by[k];
            if(nx>=0 && nx<N && ny>=0 && ny<N && island[nx][ny] ==1){
                island[nx][ny] =0;
                DFS(nx,ny);

            }
        }

    }
}
