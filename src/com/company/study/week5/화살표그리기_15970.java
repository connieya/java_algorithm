package com.company.study.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 화살표그리기_15970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i] = new Point(x, y);
        }
        int answer = 0;
        for (int j = 0; j < N; j++) {
            Point point = points[j];
            int MIN = Integer.MAX_VALUE;
            for (int k = 0; k < N; k++) {
                if (j == k) continue;
                if (point.y == points[k].y) {
                    int abs = Math.abs(point.x - points[k].x);
                    MIN = Math.min(abs, MIN);
                }
            }
            answer += MIN;
        }
        System.out.println(answer);
    }
}
