package com.company.study2021.graph;

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

public class 미로의최단경로 {
    static int miro[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        miro = new int[7][7];
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                miro[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(0, 0);
        if (miro[6][6] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(miro[6][6]);
        }
    }

    public static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int k = 0; k < len; k++) {
                Point current = queue.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = current.x + dx[i];
                    int ny = current.y + dy[i];
                    if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && miro[nx][ny] == 0) {
                        miro[nx][ny] = miro[current.x][current.y] + 1;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
        }
    }
}
