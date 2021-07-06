package com.company.inflearn.sec08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 미로의최단거리통로_BFS {
    static int[][] board, dis;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        BFS(1, 1);
        if (dis[7][7]==0){
            System.out.println(-1);
        }else {
            System.out.println(dis[7][7]);
        }

    }
    static void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x,y));
        board[x][y] =1;
        while (!Q.isEmpty()){
            Point temp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny <= 1 && ny >= 7 && board[nx][ny] == 0) {
                    board[nx][ny]= 1;
                    Q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
                }
            }
        }
    }
}
