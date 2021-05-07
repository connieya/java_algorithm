package com.company.inflearn.sec06;

import java.util.Scanner;

class Point implements Comparable<Point>{

    public int x ,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y- o.y;

        return 0;
    }
}

public class Main7_a {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];




    }
}
