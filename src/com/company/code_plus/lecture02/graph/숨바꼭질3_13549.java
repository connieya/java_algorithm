package com.company.code_plus.lecture02.graph;

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

public class 숨바꼭질3_13549 {
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if (n >= k) {
            System.out.println(n - k);
        } else {
            bfs(n, k);
            System.out.println(ans);
        }
    }

    public static void bfs(int n, int k) {
        boolean visited[] = new boolean[100_001];
        visited[n] = true;
        LinkedList<Direction> queue = new LinkedList<>();
        queue.offer(new Direction(n, 0));
        while (!queue.isEmpty()){
            Direction cur = queue.pollFirst();
            if (cur.direction == k){
                ans = cur.time;
                break;
            }
            int dx[] = {1,-1, cur.direction};
            for (int i=0; i<3; i++){
                int nx = dx[i] + cur.direction;
                if (nx >=0 && nx<=100000 && !visited[nx]){
                    visited[nx] = true;
                    if (i < 2){
                        queue.addLast(new Direction(nx,cur.time+1));
                        continue;
                    }
                    queue.addFirst(new Direction(nx,cur.time));
                }
            }
        }
    }
}
