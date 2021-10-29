package com.company.code_plus.lecture02.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Point {
    int x ,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 탈출_3055 {
    static int R, C;
    static char graph[][];
    static Point []  points= new Point[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        graph = new char[R][C];
        for (int i=0; i<R; i++) {
            String str = br.readLine();
            for (int j=0; j<C; j++){
                graph[i][j] = str.charAt(j);
            }
        }
    }
}
