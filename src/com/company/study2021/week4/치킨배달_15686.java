package com.company.study2021.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 치킨배달_15686 {
    static int N, M;
    static int graph[][];
    static List<Point> home = new ArrayList<>();
    static List<Point> chicken = new ArrayList<>();
    static boolean visit[];
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 1) {
                    home.add(new Point(i, j));
                } else if (graph[i][j] == 2) {
                    chicken.add(new Point(i, j));
                }
            }
        }
        visit = new boolean[chicken.size()];
        dfs(0,0);
        System.out.println(answer);
    }

    public static void dfs(int L, int start) {
        if (L == M) {
            int sum = 0;
            for (int i = 0; i < home.size(); i++) {
                int MIN  = Integer.MAX_VALUE;
                for (int j = 0; j < chicken.size(); j++) {
                    if (visit[j]) {
                        int a = Math.abs(home.get(i).x - chicken.get(j).x);
                        int b = Math.abs(home.get(i).y - chicken.get(j).y);
                        MIN = Math.min(MIN , a+b);
                    }
                }
                sum += MIN;
            }
            answer  = Math.min(answer , sum);
            return;
        }


        for (int i = start; i < chicken.size(); i++) {
            visit[i] = true;
            dfs(L + 1, i + 1); // 조합
            visit[i] = false;
        }
    }
}
