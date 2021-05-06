package com.company.programmers.level1;

import java.util.Scanner;
import java.util.Stack;

public class Crane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        for (int x : moves){
            for (int i = 0; i< board.length; i++){
                if (board[i][x-1] != 0 && stack.peek() != board[i][x-1]){
                    stack.push(board[i][x-1]);
                    board[i][x-1] = 0;
                    break;
                }else if (stack.peek() == board[i][x-1]){
                    stack.pop();
                    board[i][x-1] = 0;
                    answer +=2;
                    break;
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int board[][] = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j] =sc.nextInt();
            }
        }
        int m = sc.nextInt();

        int moves[] = new int[m];
        for (int k=0; k<m; k++){
            moves[k] =sc.nextInt();
        }
        Crane c = new Crane();
        System.out.println(c.solution(board,moves));

    }

}
