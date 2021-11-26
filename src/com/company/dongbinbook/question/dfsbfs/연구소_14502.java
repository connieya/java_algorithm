package com.company.dongbinbook.question.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연구소_14502 {
    static int N, M ,result;
    static int map[][];
    static int temp[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        temp = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0);
        System.out.println(result);

    }

    public static void virus(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && temp[nx][ny] == 0){
                temp[nx][ny] = 2;
                virus(nx,ny);
            }
        }

    }

    public static void dfs(int count) {
        if (count == 3) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    temp[i][j] = map[i][j];
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (temp[i][j] == 2) {
                        virus(i, j);
                    }
                }
            }

            int cnt = 0 ;
            for (int i =0; i<N; i++){
                for (int j=0; j<M; j++){
                    if (temp[i][j] == 0){
                        cnt++;
                    }
                }
            }
            result = Math.max(result , cnt);
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    count++;
                    dfs(count);
                    map[i][j] = 0;
                    count--;
                }
            }
        }
    }
}
