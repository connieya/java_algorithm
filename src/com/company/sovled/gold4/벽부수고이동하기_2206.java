package com.company.sovled.gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pos {
    int x, y, crush;

    public Pos(int x, int y, int crush) {
        this.x = x;
        this.y = y;
        this.crush = crush;
    }
}

public class 벽부수고이동하기_2206 {
    static int n, m;
    static int map[][];
    static int answer[][][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        answer = new int[n][m][2];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    answer[j][k][i] = -1;
                }
            }
        }
        answer[0][0][0] = 1;
        answer[0][0][1] = 1;
        System.out.println(bfs(0, 0));
    }

    public static int bfs(int x, int y) {
        Queue<Pos> queue = new LinkedList<>();
        queue.add(new Pos(x, y, 0));
        while (!queue.isEmpty()) {
            Pos cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (nx == n - 1 && ny == m - 1) {
                    return answer[nx][ny][cur.crush];
                }
                if (map[nx][ny] == 0 && answer[nx][ny][cur.crush] == -1) {
                    answer[nx][ny][cur.crush] = answer[cur.x][cur.y][cur.crush] + 1;
                    queue.add(new Pos(nx, ny, cur.crush));
                }
                if (map[nx][ny] == 1 && answer[nx][ny][1] == -1 && cur.crush == 0) {
                    queue.add(new Pos(nx, ny, 1));
                    answer[nx][ny][1] = answer[cur.x][cur.y][cur.crush] + 1;
                }
            }
        }
        return -1;
    }
}
