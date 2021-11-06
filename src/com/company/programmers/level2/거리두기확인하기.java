package com.company.programmers.level2;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int x, y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class 거리두기확인하기 {
    static char[][] room;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) {
        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"},
        };
        int len = places.length;
        int[] answer = new int[len];
        room = new char[5][5];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 5; j++) {
                String str = places[i][j];
                for (int k = 0; k < 5; k++) {
                    room[j][k] = str.charAt(k);
                }
            }
            boolean visited[][] = new boolean[5][5];
            answer[i] = 1;
            loop:
            for (int x = 0; x < 5; x++) {
                for (int y = 0; y < 5; y++) {
                    if (room[x][y] == 'P' && !bfs(x, y, visited)) {
                        answer[i] = 0;
                        break loop;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(answer));

    }

    public static boolean bfs(int x, int y, boolean visited[][]) {
        visited[x][y] = true;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    if (room[nx][ny] == 'X') continue;
                    if (room[nx][ny] == 'P') return false;
                    queue.offer(new Node(nx, ny));
                }
            }
        }
        return true;
    }
}
