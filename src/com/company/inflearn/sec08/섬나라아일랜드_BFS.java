package com.company.inflearn.sec08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position{
    int x,y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 섬나라아일랜드_BFS {
    static int N ,count = 0;
    static int island[][];
    static int bx [] = {-1,-1,0,1,1,1,0,-1};
    static int by [] = {0,1,1,1,0,-1,-1,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        island = new int[N][N];
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                island[i][j] = sc.nextInt();
            }
        }
        Queue<Position> queue = new LinkedList<>();
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                if (island[i][j] == 1){
                    BFS(i,j ,queue);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static void BFS(int i, int j , Queue<Position> queue){
        queue.offer(new Position(i,j));
        while (!queue.isEmpty()){
            Position poll = queue.poll();
            for (int k=0; k<8; k++){
                int nx = poll.x +bx[k];
                int ny = poll.y+ by[k];
                if(nx>=0 && nx<N && ny>=0 && ny<N && island[nx][ny] ==1){
                    island[nx][ny] =0;
                    queue.offer(new Position(nx,ny));
                }
            }

        }
    }
}
