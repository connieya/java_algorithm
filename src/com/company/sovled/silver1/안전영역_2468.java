package com.company.sovled.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pos {
    int x, y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 안전영역_2468 {
    static int n;
    static int area[][];
    static boolean visited[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        area = new int[n][n];
        int answer = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                min = Math.min(min, area[i][j]);
                max = Math.max(max, area[i][j]);
            }
        }
        // 완전 탐색 시작
        for (int i = min; i <= max; i++) {
            visited = new boolean[n][n];
            count = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (area[j][k] > i && !visited[j][k]) {
                        count++;
                        visited[j][k] = true;
                        bfs(j, k, i);
                    }
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }

    public static void bfs(int x, int y, int standard) {
        Queue<Pos> queue = new LinkedList<>();
        queue.add(new Pos(x, y));
        while (!queue.isEmpty()) {
            Pos cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + cur.x;
                int ny = dy[i] + cur.y;
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && area[nx][ny] > standard && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new Pos(nx, ny));
                }
            }
        }
    }
}
