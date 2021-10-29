package com.company.study.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 미로탐색 {
    static int count = 0;
    static int miro[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        miro = new int[7][7];
        for (int i=0; i<7; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<7; j++) {
                miro[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        miro[0][0] =1;
        dfs(0,0);
        System.out.println(count);

    }

    public static void dfs(int x, int y) {
        if (x == 6 && y == 6) {
            count++;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && miro[nx][ny] == 0) {
                miro[nx][ny] = 1;
                dfs(nx, ny);
                miro[nx][ny] = 0;
            }
        }

    }
}
