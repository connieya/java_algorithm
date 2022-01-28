package com.company.sovled.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Snake {
    int x, y;

    public Snake(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 뱀_3190 {
    static int dir = 0;
    static Map<Integer, String> map;
    static int tail[] = new int[2];
    static int dx[] = {0, 1, 0, -1}; // 동 : 0, 남 : 1 , 서 : 2 , 북 : 3
    static int dy[] = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int board[][] = new int[n + 1][n + 1];
        int k = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        StringTokenizer st;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = 2;
        }
        int L = Integer.parseInt(br.readLine());
        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            int second = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();
            map.put(second, dir);
        }
        int res = startGame(n, board);
        System.out.println(res);
    }

    public static void move(String command) {
        if (command.equals("D")) {
            dir++;
        } else {
            dir--;
        }
        if (dir == 4) {
            dir = 0;
        }
        if (dir == -1) {
            dir = 3;
        }
    }

    public static int startGame(int n, int board[][]) {
        Queue<Snake> queue = new LinkedList<>();
        queue.offer(new Snake(1, 1));
        int time = 0;
        int x = 1, y = 1;
        while (true) {
            if (map.containsKey(time)) {
                String d = map.get(time);
                move(d);
            }
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx == 0 || nx == n + 1 || ny == 0 || ny == n + 1 || board[nx][ny] == 1) {
                break;
            }
            if (board[nx][ny] != 2) { // 사과가 없다면
                Snake prev = queue.poll();
                board[prev.x][prev.y] = 0;
            }
            queue.offer(new Snake(nx, ny));
            board[nx][ny] = 1;
            time++;
            x = nx;
            y = ny;
        }
        return time+1;
    }
}
