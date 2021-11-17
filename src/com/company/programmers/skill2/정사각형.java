package com.company.programmers.skill2;

public class 정사각형 {
    public static void main(String[] args) {
        int board[][] = {{0,0,1,1} , {1,1,1,1}};
        for(int i=1; i<board.length; i++){
            for(int j=1; j<board[i].length; j++){
                int min = Math.min(Math.min(board[i-1][j-1], board[i][j-1]) , board[i-1][j]);
                board[i][j] = min +1;
            }
        }
        int max = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                max = Math.max(max , board[i][j]);
            }
        }
        System.out.println(max);
    }
}
