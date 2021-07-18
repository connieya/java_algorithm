package com.company.inflearn.sec05_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main3_a {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
       for (int pos : moves){
           for (int i=0; i<board.length; i++){
               if (board[i][pos-1] != 0){
                   int tmp = board[i][pos-1];
                   board[i][pos-1] = 0;
                   if (!stack.isEmpty() && tmp == stack.peek()){
                        answer += 2;
                        stack.pop();
                   }else{
                       stack.push(tmp);
                   }
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int moves[] = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        Main3_a M = new Main3_a();
        System.out.println(M.solution(board,moves));


    }
}
