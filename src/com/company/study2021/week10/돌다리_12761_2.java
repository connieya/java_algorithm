package com.company.study2021.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Direction {
    int direction;
    int time;

    public Direction(int direction, int time) {
        this.direction = direction;
        this.time = time;
    }
}

public class 돌다리_12761_2 {
    static int A,B,N,M;
    static boolean[] visited = new boolean[100_001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        bfs();
    }

    public static void bfs(){
        Queue<Direction> queue = new LinkedList<>();
        queue.offer(new Direction(N,0));
        int dx[] = {-1,1,A,B,-A,-B,A,B};
        int next;
        while (!queue.isEmpty()){
            Direction current = queue.poll();
            if (current.direction == M){
                System.out.println(current.time);
                break;
            }
            for (int i=0; i<8; i++){
                if (i>=6){
                    next = current.direction *dx[i];
                }else{
                    next = current.direction+dx[i];
                }
                if (next>=0 && next <=100_000 && !visited[next]){
                    visited[next] = true;
                    queue.offer(new Direction(next,current.time+1));
                }
            }
        }
    }
}
