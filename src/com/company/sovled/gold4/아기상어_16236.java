package com.company.sovled.gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Shark {
    int x, y, size, ate;

    public Shark() {
    }

    public Shark(int x, int y, int size, int ate) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.ate = ate;
    }

    void sizeUp() {
        size++;
        ate = 0;

    }
}

class State implements Comparable<State> {
    int x, y, dis;

    public State(int x, int y, int dis) {
        this.x = x;
        this.y = y;
        this.dis = dis;
    }

    @Override
    public int compareTo(State o) {
        if (o.dis == this.dis) {
            if (o.x == this.x) return this.y - o.y;
            return this.x - o.x;
        }
        return this.dis - o.dis;

    }
}

public class 아기상어_16236 {
    static int map[][];
    static boolean visited[][];
    static int n, ans;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        PriorityQueue<State> pq = new PriorityQueue<>();
        Shark baby = new Shark();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 9) {
                    map[i][j] = 0;
                    baby = new Shark(i, j, 2, 0);
                }
            }
        }
        pq.add(new State(baby.x, baby.y, 0));
        while (!pq.isEmpty()){
            State cur = pq.poll();
            int x = cur.x;
            int y =cur.y;
            int dis = cur.dis;
            if (map[x][y] != 0 && baby.size > map[x][y]) { // 물고기 잡아 먹음
                map[x][y] = 0;
                baby.x = x;
                baby.y = y;
                baby.ate++;
                if (baby.ate >= baby.size){
                    baby.sizeUp();
                }
                while (!pq.isEmpty()){
                    pq.poll();
                }
                init();
                ans = dis;
            }
            // 물고기 잡으러 탐색
            for (int i=0; i<4; i++){
                int nx = x +dx[i];
                int ny = y+dy[i];
                if (nx <0 || nx >= n || ny < 0 || ny >= n) continue;
                if (!visited[nx][ny] && baby.size >=  map[nx][ny]) {
                    visited[nx][ny] = true;
                    pq.add(new State(nx,ny,dis+1));
                }
            }
        }
        System.out.println(ans);
    }
    public static void init() {
        for (int i=0; i<n; i++){
            Arrays.fill(visited[i], false);
        }
    }
}
