package com.company.test.woowa;

import java.util.Arrays;



public class Test4 {
    static int answer[][];

    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        answer = new int[rows][columns];
        answer[0][0] = 1;
        dfs(0, 0, rows, columns);
        System.out.println(Arrays.deepToString(answer));
    }

    public static void dfs(int x, int y, int rows, int columns) {
        if (check()) {
            return;
        }
        if ((rows == columns) && answer[x][y] == rows * 2) {
            return;
        }
        int nx = x + 1;
        int ny = y + 1;
        if (nx == rows) {
            nx = 0;
        }
        if (ny == columns) {
            ny = 0;
        }

        if (answer[x][y] % 2 == 0) {
            answer[nx][y] = answer[x][y] + 1;
            dfs(nx, y, rows, columns);
        } else {
            answer[x][ny] = answer[x][y] + 1;
            dfs(x, ny, rows, columns);
        }
    }

    public static boolean check() {
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (answer[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
