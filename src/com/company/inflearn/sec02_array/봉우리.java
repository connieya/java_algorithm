package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 봉우리 {
    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int board[][] = new int[N+2][N+2];
        for (int i=1; i<=N; i++){
            for (int j=1; j<=N; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int count =0;
        for (int i=1; i<=N; i++){
            for (int j=1; j<=N; j++){
                if (check(board,i,j)) count++;
            }
        }
        System.out.println(count);

    }
    static boolean check(int board[][], int x, int y){
        for (int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y+ dy[i];
            if (board[x][y] <=board[nx][ny]){
                return false;
            }
        }
        return true;
    }
}
