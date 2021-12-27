package com.company.study2021.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 나이트의이동_7562 {
    static class Position {
        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int dx[] = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int dy[] = {1, 2, 2, 1, -1, -2, -2, -1};
    static int l;
    static int chess[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            l = Integer.parseInt(br.readLine());
            chess = new int[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int current1 = Integer.parseInt(st.nextToken());
            int current2 = Integer.parseInt(st.nextToken());
            Position current = new Position(current1, current2);
            st = new StringTokenizer(br.readLine());
            int move1 = Integer.parseInt(st.nextToken());
            int move2 = Integer.parseInt(st.nextToken());
            chess[current1][current2] = 0;
            bfs(current);
            if (current1 == move1 && current2 == move2) {
                System.out.println(0);
            }else {

                System.out.println(chess[move1][move2]);
            }

        }
    }

    public static void bfs(Position current) {
        Queue<Position> queue = new LinkedList<>();
        queue.offer(current);
        while (!queue.isEmpty()) {
            Position position = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = position.x + dx[i];
                int ny = position.y + dy[i];
                if (nx >= 0 && nx < l && ny >= 0 && ny < l && chess[nx][ny] == 0) {
                    chess[nx][ny] = chess[position.x][position.y] + 1;
                    queue.offer(new Position(nx, ny));
                }
            }
        }
    }

}
