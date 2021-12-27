package com.company.sovled.gold4;

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

public class 빙산_2573 {
    static int N, M;
    static int iceberg[][];
    static int nx_iceberg[][];
    static boolean visited[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 0;
        boolean flag = false;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        iceberg = new int[N][M];
        nx_iceberg = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                iceberg[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while (true) {
            visited = new boolean[N][M];
            int cnt = countIceberg();
            if (cnt >=2){
                flag = true;
                break;
            }
            if (cnt == 0){
                break;
            }
            ans++;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (iceberg[i][j] > 0) {
                        getNextIceberg(i, j);
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    iceberg[i][j] = nx_iceberg[i][j];
                }
            }
        }

        if (flag){
            System.out.println(ans);
        }else{
            System.out.println(0);
        }
    }

    public static int countIceberg() {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (iceberg[i][j] > 0 && !visited[i][j]) {
                    cnt++;
                    visited[i][j] = true;
                    bfs(i, j);
                }
            }
        }
        return cnt;
    }

    public static void bfs(int x, int y) {
        Queue<Dir> queue = new LinkedList<>();
        queue.offer(new Dir(x, y));
        while (!queue.isEmpty()) {
            Dir cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && iceberg[nx][ny] >0) {
                    visited[nx][ny] = true;
                    queue.offer(new Dir(nx, ny));
                }
            }
        }
    }

    public static void getNextIceberg(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
            if (iceberg[nx][ny] <= 0) {
                cnt++;
            }
        }
        nx_iceberg[x][y] = iceberg[x][y] - cnt;
        if (nx_iceberg[x][y] <= 0){
            nx_iceberg[x][y] = 0;
        }
    }
}
