package com.company.study2021.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 배열돌리기1_16926 {
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int arr[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int group = Math.min(N, M) / 2;
        while (R-- > 0) {
            for (int i = 0; i < group; i++) {
                int x = i;
                int y = i;
                int value = arr[x][y];
                int dir = 0;
                while (dir < 4) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];
                    if (nx >= i && nx < N - i && ny >= i && ny < M - i) {
                        arr[x][y] = arr[nx][ny];
                        x = nx;
                        y = ny;
                    } else {
                        dir++;
                    }
                }
                arr[x+1][y] =  value;
            }
        }

        for (int a[] : arr) {
            for (int v : a) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

    }
}
