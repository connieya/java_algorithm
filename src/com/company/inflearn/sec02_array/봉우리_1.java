package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 봉우리_1 {
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int mountain[][];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        mountain = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mountain[i][j] = sc.nextInt();
            }
        }

        System.out.println(calculatePeaks());
    }

    private static int calculatePeaks() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isPeaks(i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPeaks(int x, int y) {
        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= n || ny >=n) {
                continue;
            }

            if (mountain[nx][ny] >= mountain[x][y]) {
                return false;
            }
        }
        return true;
    }

}
