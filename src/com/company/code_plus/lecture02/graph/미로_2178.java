package com.company.code_plus.lecture02.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dir {
    int x, y;

    public Dir(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 미로_2178 {
    static int N, M;
    static int graph[][];
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = input.charAt(j) - '0';
            }
        }
        dfs();
        System.out.println(graph[N - 1][M - 1]);
    }

    public static void dfs() {
        Queue<Dir> queue = new LinkedList<>();
        queue.offer(new Dir(0, 0));
        while (!queue.isEmpty()) {
            Dir dir = queue.poll();
            for (int j = 0; j < 4; j++) {
                int nx = dir.x + dx[j];
                int ny = dir.y + dy[j];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && graph[nx][ny] == 1) {
                    queue.offer(new Dir(nx, ny));
                    graph[nx][ny] = graph[dir.x][dir.y] + 1;
                }
            }

        }
    }
}
