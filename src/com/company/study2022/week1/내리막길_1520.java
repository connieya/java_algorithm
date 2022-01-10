package com.company.study2022.week1;

import java.util.Arrays;

public class 내리막길_1520 {
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int arr[][];
    static int dp[][];

    public static void main(String[] args) {
        arr = new int[][]{
                {142, 24, 35, 21},
                {31, 18, 15, 10},
                {13, 23, 15, 5}
        };
        dp = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(dfs(0, 0, arr[0][0]));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int dfs(int x, int y, int prev) {
        if (x == arr.length - 1 && y == arr[0].length - 1) {
            return 1;
        }
        if (dp[x][y] == -1) {
            dp[x][y] = 0;
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if (nx < 0 || nx >= arr.length || ny < 0 || ny >= arr[0].length) continue;
                if (prev > arr[nx][ny]) {
                    System.out.println(String.format("( %d , %d )", nx, ny));
                    dp[x][y] += dfs(nx, ny, arr[nx][ny]);
                }
            }
        }
        return dp[x][y];
    }
}
