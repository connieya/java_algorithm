package com.company.programmers.level2;


public class 방문길이 {
    public static void main(String[] args) {
        boolean visited[][][][] = new boolean[11][11][11][11];
        int answer = 0;
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};
        int x = 5, y = 5;
        int nx = 5,ny = 5;
        String dirs = "LULLLLLLU";
        for (char ch : dirs.toCharArray()) {
            if (ch == 'U') {
                nx = x + dx[0];
                ny = y + dy[0];
            } else if (ch == 'L') {
                nx = x + dx[3];
                ny = y + dy[3];
            } else if (ch == 'R') {
                nx = x + dx[1];
                ny = y + dy[1];
            } else if (ch == 'D') {
                nx = x + dx[2];
                ny = y + dy[2];
            }
            if (nx < 0 || nx > 10 || ny < 0 || ny > 10){
                continue;
            }
            if (!visited[x][y][nx][ny]) {
                visited[x][y][nx][ny] = true;
                visited[nx][ny][x][y] = true;
                answer++;
            }
            x = nx;
            y= ny;

        }
        System.out.println(answer);


    }
}
