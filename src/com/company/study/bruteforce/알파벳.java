package com.company.study.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알파벳 {
    static boolean[] alpha = new boolean[26];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char board[][] = new char[R][C];
        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        alpha[board[0][0]-'A']  = true;
        dfs(board, 0, 0, R, C, 1);
        System.out.println(MAX);
    }

    public static void dfs(char board[][], int x, int y, int R, int C, int count) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                char next = board[nx][ny];
                if (!alpha[next - 'A']) {
                    alpha[next - 'A'] = true;
                    dfs(board, nx, ny, R, C, count + 1);
                    alpha[next - 'A'] = false;
                }
            }
        }
        MAX = Math.max(MAX, count);
    }
}
