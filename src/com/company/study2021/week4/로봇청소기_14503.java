package com.company.study2021.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로봇청소기_14503 {
    static int direction;
    // 0 : 북  1 :동  2 :남  3: 서
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void turnLeft() {
        direction--;
        if (direction < 0) {
            direction = 3;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int room[][] = new int[N][M];
        int checked[][] = new int[N][M];
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        checked[r][c] = 1;
        int cnt = 1;
        int turn_time = 0;
        while (true) {
            turnLeft();
            int nx = r + dx[direction];
            int ny = c + dy[direction];
            if (room[nx][ny] == 0 && checked[nx][ny] == 0) {
                checked[nx][ny] = 1;
                r = nx;
                c = ny;
                cnt++;
                turn_time = 0;
                continue;
            }
            turn_time++;
            if (turn_time == 4) {
                nx = r - dx[direction];
                ny = c - dy[direction];
                if (room[nx][ny] == 0) {
                    r = nx;
                    c = ny;
                    turn_time = 0;
                } else {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
