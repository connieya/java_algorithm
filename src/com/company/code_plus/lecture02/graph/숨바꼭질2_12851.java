package com.company.code_plus.lecture02.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Game {
    int v;
    int time;

    public Game(int v, int time) {
        this.v = v;
        this.time = time;
    }
}

public class 숨바꼭질2_12851 {
    static int n, k;
    static int L, count =1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        L = Integer.MAX_VALUE;
        if (n > k) {
            System.out.println(n - k);
            System.out.println(1);
        } else {
            bfs();
            System.out.println(L);
            System.out.println(count);
        }
    }

    public static void bfs() {
        Queue<Game> queue = new LinkedList<>();
        queue.offer(new Game(n, 0));
        boolean[] visited = new boolean[100_001];
        visited[n] = true;
        while (!queue.isEmpty()) {
            Game game = queue.poll();
            visited[game.v] = true;
            if (game.v == k) {
                if (L > game.time){
                    L = game.time;
                }else if (L == game.time){
                    count++;
                }
                continue;
            }

            int dx1 = game.v + 1;
            int dx2 = game.v - 1;
            int dx3 = game.v * 2;
            if (dx1 < 100_001 && !visited[dx1]){
                queue.offer(new Game(dx1 , game.time+1));
            }
            if (dx3 <= 100_001 && !visited[dx3]){
                queue.offer(new Game(dx3 , game.time+1));
            }
            if (dx2 > 0  && !visited[dx2]){
                queue.offer(new Game(dx2 , game.time+1));
            }
        }

    }
}
