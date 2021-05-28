package com.company.baekjoon.math2;

import java.util.Scanner;

public class Main_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int min1 = Math.min(w - x, h - y);
        int min2 = Math.min(x - 0, y - 0);
        System.out.println(Math.min(min1,min2));
    }
}
