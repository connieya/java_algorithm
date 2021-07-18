package com.company.inflearn.sec08_dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2{
    int x,y;
    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class 토마토_BFS활용 {
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,1,0,-1};
    static int N,M;
    static int BOX[][] ,dis[][];
    static boolean check =true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         M = sc.nextInt();
         N = sc.nextInt();
         BOX = new int[N][M];
         dis = new int[N][M];
        Queue<Point2> queue = new LinkedList<>();
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                BOX[i][j] = sc.nextInt();
                if (BOX[i][j]==1){
                    queue.offer(new Point2(i,j));
                }
            }
        }
            BFS(queue);
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                if (BOX[i][j] == 0){
                    check = false;
                }
            }
        }
        int MAX = Integer.MIN_VALUE;
        if (check){
            for (int i=0; i<N; i++){
                for (int j=0;j<M; j++){
                    if (dis[i][j]>MAX){
                        MAX = dis[i][j];
                    }
                }
            }
            System.out.println(MAX);
        }else {
            System.out.println(-1);
        }
    }
    static void BFS(Queue<Point2> queue){
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int m = 0; m<len; m++){
                Point2 poll = queue.poll();
                for (int k=0; k<4; k++){
                    int nx = dx[k]+ poll.x;
                    int ny = dy[k]+ poll.y;
                    if (nx>=0 && nx<N && ny>=0 && ny<M && BOX[nx][ny] ==0){
                        BOX[nx][ny] =1;
                        dis[nx][ny] = dis[poll.x][poll.y] +1;
                        queue.offer(new Point2(nx,ny));
                    }
                }

            }

        }

    }
}
