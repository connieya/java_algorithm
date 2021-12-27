package com.company.study2021.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 양치기꿍_3187 {
    static char[][] fence;
    static boolean visited[][];
    static int v, k, R, C;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        fence = new char[R][C];
        visited = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                fence[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j] && fence[i][j] != '#') {
                    bfs(i, j);
                }
            }
        }
        System.out.println(k + " " + v);
    }

    public static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        int wolf = 0;
        int sheep = 0;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (fence[point.x][point.y] == 'v') {
                wolf++;
            } else if (fence[point.x][point.y] == 'k') {
                sheep++;
            }
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && fence[nx][ny] != '#') {
                    visited[nx][ny] = true;
                    queue.offer(new Point(nx,ny));
                }
            }
        }
        if (sheep > wolf){
            k += sheep;
        }else {
            v += wolf;
        }
    }
}
