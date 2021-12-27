package com.company.sovled.gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 말이되고픈원숭이_1600 {
    static int k, w, h;
    static int board[][];
    static boolean visited[][];
    static int min = Integer.MAX_VALUE;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int dkx[] = {-2, -2, -1, 1, 2, 2, 1, -1};
    static int dky[] = {-1, 1, 2, 2, 1, -1, -2, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        board = new int[h][w];
        visited = new boolean[h][w];
        visited[0][0] = true;
        dfs(0, 0, 0, 0);
        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }

    public static void dfs(int x, int y, int count, int v) {
        if (x == h - 1 && y == w - 1) {
            if (v <= k) {
                min = Math.min(count, min);
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (nx < 0 || nx >= h || ny < 0 || ny >= w) continue;
            if (board[nx][ny] == 1) continue;
            if (!visited[nx][ny]) {
                visited[nx][ny] = true;
                dfs(nx, ny, count + 1, v);
                visited[nx][ny] = false;
            }

        }
        for (int i = 0; i < 8; i++) {
            int nx = dkx[i] + x;
            int ny = dky[i] + y;
            if (nx < 0 || nx >= h || ny < 0 || ny >= w) continue;
            if (board[nx][ny] == 1) continue;
            if (!visited[nx][ny]) {
                visited[nx][ny] = true;
                dfs(nx, ny, count + 1, v + 1);
                visited[nx][ny] = false;
            }

        }
    }
}
