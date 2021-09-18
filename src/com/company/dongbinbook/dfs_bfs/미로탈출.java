package com.company.dongbinbook.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

class Direction {
    int x, y;

    public Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class 미로탈출 {
    static int miro[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) {
        miro = new int[][]{
                {1, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };

        BFS(0, 0);
        System.out.println(miro[4][5]);
    }

    static void BFS(int x, int y) {
        Queue<Direction> queue = new LinkedList<>();
        queue.offer(new Direction(x, y));
        while (!queue.isEmpty()) {
            Direction direction = queue.poll();
            x = direction.getX();
            y = direction.getY();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if (nx < 0 || nx >= 5 || ny < 0 || ny >= 6) {
                    continue;
                }

                if (miro[nx][ny] == 0) {
                    continue;
                }
                if (miro[nx][ny] == 1) {
                    miro[nx][ny] = miro[x][y] + 1;
                    queue.offer(new Direction(nx, ny));
                }
            }
        }

    }
}
