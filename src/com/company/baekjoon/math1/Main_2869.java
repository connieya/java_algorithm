package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        // 현재 위치
        int i = 0;
        int day = 1;

        while (v > i+a){
            i = i+a-b;

            day++;
        }
        System.out.println(day);


    }
}
