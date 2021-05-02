package com.company.programmers.level1;

import java.util.Scanner;

public class Crane {
    public int solution(int[][] board ,int[] moves){
        int answer = 0;

        for (int i=0; i< moves.length; i++){
            int m = moves[i];
            for (int k=1; k<board.length; k++){
                for (int j=1; j<board.length; j++){
                    if (m ==k && board[j][k] ==0){
                        break;
                    }else {
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int board[][] = new int[n+1][n+1];

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                board[i][j] =sc.nextInt();
            }
        }
        int moves[] = new int[]{1,5,3,5,1,2,1,4};

        Crane c = new Crane();
        System.out.println(c.solution(board,moves));

    }

}
