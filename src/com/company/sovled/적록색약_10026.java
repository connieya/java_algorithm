package com.company.sovled;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
    int x, y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 적록색약_10026 {
    static int n;
    static char grid[][];
    static char tmp[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        grid = new char[n][n];
        tmp = new char[n][n];
        int not_color_weakness_cnt = 0;
        int color_weakness_cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tmp[i][j] != 'c') {
                    tmp[i][j] = 'c';
                    not_color_weakness_cnt++;
                    bfs(i, j, grid[i][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 'c') {
                    color_weakness_cnt++;
                    bfs2(i,j,grid[i][j]);
                    grid[i][j] = 'c';
                }
            }
        }
        System.out.println(not_color_weakness_cnt + " " + color_weakness_cnt);
    }

    public static void bfs(int x, int y, char standard) {
        Queue<Pos> queue = new LinkedList<>();
        queue.add(new Pos(x, y));
        while (!queue.isEmpty()) {
            Pos cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + cur.x;
                int ny = dy[i] + cur.y;
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (grid[nx][ny] != standard || tmp[nx][ny] == 'c') continue;
                queue.add(new Pos(nx, ny));
                tmp[nx][ny] = 'c';

            }
        }
    }
    public static void bfs2(int x, int y, char standard) {
        Queue<Pos> queue = new LinkedList<>();
        queue.add(new Pos(x, y));
        while (!queue.isEmpty()) {
            Pos cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + cur.x;
                int ny = dy[i] + cur.y;
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (grid[nx][ny] == standard) {
                    grid[nx][ny] = 'c';
                    queue.add(new Pos(nx,ny));
                }
                if ((standard=='R' && grid[nx][ny] =='G') || (standard=='G'&& grid[nx][ny] == 'R')){
                    grid[nx][ny] = 'c';
                    queue.add(new Pos(nx,ny));
                }

            }
        }
    }
}
