package com.company.sovled.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Direction {
    int x;
    int y;

    public Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 그림_1926 {
    static int n, m;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int board[][];
    static boolean visit[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int max = 0;
        board = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    cnt++;
                    max = Math.max(max, bfs(i, j));
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }

    public static int bfs(int x, int y) {
        Queue<Direction> queue = new LinkedList<>();
        visit[x][y] = true;
        int width = 1;
        queue.add(new Direction(x, y));
        while (!queue.isEmpty()) {
            Direction cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + cur.x;
                int ny = dy[i] + cur.y;
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visit[nx][ny] && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    visit[nx][ny] = true;
                    queue.add(new Direction(nx, ny));
                    width++;
                }
            }
        }
        return width;
    }
}
