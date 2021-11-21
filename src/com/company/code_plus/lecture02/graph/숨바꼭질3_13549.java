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
    static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        bfs(n,k);
        System.out.println(min);
    }

    public static void bfs(int n, int k) {
      boolean visited[] = new boolean[100_001];
        Queue<Direction> queue = new LinkedList<>();
        queue.offer(new Direction(n, 0));
        int next = 0;
        min = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            Direction current = queue.poll();
            visited[current.direction] = true;
            if (current.direction == k && min > current.time) {
                    min = current.time;
            }
            next = current.direction+1;
            if (next <100_001 && !visited[next]) {
                queue.offer(new Direction(next , current.time+1));
            }
            next = current.direction-1;
            if (next > 0 && !visited[next]) {
                queue.offer(new Direction(next , current.time+1));
            }
            next =current.direction*2;
            if (next < 100_001 && !visited[next]) {
                queue.offer(new Direction(next , current.time));
            }
        }
    }
}
