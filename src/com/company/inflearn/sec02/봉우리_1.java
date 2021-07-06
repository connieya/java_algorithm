package com.company.inflearn.sec02;

import java.util.Scanner;

public class 봉우리_1 {
    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int board[][] = new int[N][N];
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int count =0;
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                boolean flag = true;
                for (int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx>=0 && nx<N && ny>=0 && ny<N && board[nx][ny]>= board[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag) count++;
            }
        }
        System.out.println(count);

    }

}
