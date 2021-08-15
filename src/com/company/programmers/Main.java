package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        int x[] = {5};
        int y[] = {5};
        int r[] = {5};
        int v[] = {92, 83, 14, 45, 66, 37, 28, 9, 10, 81};
        int l = Integer.MAX_VALUE;
        int r1 = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        int t = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            l = Math.min(x[i] - r[i], l);
            r1 = Math.max(x[i] + r[i], r1);
            b = Math.min(y[i] - r[i], b);
            t = Math.max(y[i] + r[i], t);
        }
        List<Point> points = new ArrayList<>();
        int point[][] = new int[v.length / 2][v.length / 2];
        for (int i = 0; i < v.length; i++) {
            int x1 = l + v[i] % (r1 - l);
            int y1 = b + v[i + 1] % (t - b);
            i++;
            points.add(new Point(x1, y1));
        }
        int count = 0;
        for (Point p : points) {
            for (int z = 0; z < x.length; z++) {
                if (Math.pow(Math.abs(p.x - x[z]), 2) + Math.pow(Math.abs(p.y - y[z]), 2) <= Math.pow(r[z],2)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        int v1 = (int) (count / (double) point.length * (r1 - l) * (t - b));
        System.out.println(v1);
    }
}
