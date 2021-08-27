package com.company.dongbinbook.implement;

import java.util.Scanner;

public class 게임개발 {
    private static int direction, x, y;
    private static int dx[] = {-1, 0, 1, 0};
    private static int dy[] = {0, 1, 0, -1};

    public static void turn_left() {
        direction -= 1;
        if (direction == -1)
            direction = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        int cnt = 1;
        int turn_time =0;
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[n][m] = sc.nextInt();
            }
        }
        while (true) {
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (arr[nx][ny] == 0) {
                cnt++;
                x = nx;
                y = ny;
            }else {
                turn_time++;
            }
            if (turn_time == 4 ) {
                nx = x -dx[direction];
                ny = y -dy[direction];

                if (arr[nx][ny] == 0 ) {
                    x = nx;
                    y = ny;
                }else {
                    break;
                }
                turn_time = 0;
            }
        }
        System.out.println();
    }

}
