package com.company.dongbinbook.implement;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 게임개발 {
    static int dir;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void turn_left() {
        dir -= 1;
        if (dir < 0) {
            dir = 3;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int map[][] = new int[n][m];
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        dir = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        map[x][y] = 1;
        int cnt = 1;
        int turn_time = 0;
        while (true) {
            turn_left();
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (map[nx][ny] == 0) {
                map[nx][ny] = 1;
                cnt++;
                x = nx;
                y = ny;
                turn_time = 0;
                continue;
            }
            turn_time++;
            if (turn_time == 4) {
                nx = x - dx[dir];
                ny = y - dy[dir];
                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }else {
                    break;
                }

                turn_time = 0;
            }
        }
        System.out.println(cnt);

    }
}
