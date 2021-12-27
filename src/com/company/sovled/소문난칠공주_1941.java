package com.company.sovled;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Dir {
    int x, y;

    public Dir(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 소문난칠공주_1941 {
    static char woman[][];
    static boolean visited[];
    static Dir seven_princess[];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int answer;

    public static void main(String[] args) throws IOException {
        woman = new char[5][5];
        seven_princess = new Dir[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < 5; j++) {
                woman[i][j] = str.charAt(j);
            }
        }
        dfs(0, 0, 0, 0);
        System.out.println(answer);
    }

    public static void dfs(int count, int start, int lds, int ldy) {
        if (lds + ldy == 7) {
            if (lds > ldy && isSevenPrincess()) {
                answer++;
            }
            return;
        }
        for (int i = start; i < 25; i++) {
            int row = i / 5;
            int column = i % 5;
            seven_princess[count] = new Dir(row, column);
            if (woman[row][column] == 'S') {
                dfs(count + 1, i + 1, lds + 1, ldy);
            } else {
                dfs(count + 1, i + 1, lds, ldy + 1);

            }

        }
    }

    public static boolean isSevenPrincess() {
        Queue<Dir> queue = new LinkedList<>();
        queue.add(new Dir(seven_princess[0].x, seven_princess[0].y));
        visited = new boolean[7];
        visited[0] = true;
        int cnt  = 1;
        while (!queue.isEmpty()) {
            Dir cur = queue.poll();
            for (int i=0; i<7; i++){
                Dir next = seven_princess[i];
                for (int j=0; j<4; j++){
                    int nx = dx[j] + cur.x;
                    int ny = dy[j] + cur.y;
                    if (nx < 0 || ny >=7 || ny <0 || nx >= 7){
                        continue;
                    }
                    if (next.x == nx && next.y == ny && !visited[i]){
                        cnt++;
                        visited[i] = true;
                        queue.add(new Dir(nx,ny));
                    }
                }
            }
        }
        if (cnt >=7){
            return true;
        }
        return false;
    }
}
