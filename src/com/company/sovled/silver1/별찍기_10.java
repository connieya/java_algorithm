package com.company.sovled.silver1;

import java.io.*;
import java.util.Arrays;

public class 별찍기_10 {
    static char board[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], ' ');
        }
        recursive(n, 0, 0);
        for (char bb[] :board){
            for (char b: bb) {
                bw.write(b+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }

    public static void recursive(int n, int x, int y) {
        if (n == 1) {
            board[x][y] = '*';
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                recursive(n / 3, x + n / 3 * i, y + n / 3 * j);
            }
        }

    }
}
