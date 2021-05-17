package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i<5; i++){
            int v = sc.nextInt();
            sum += v*v;
        }
        System.out.println(sum%10);
    }
}
