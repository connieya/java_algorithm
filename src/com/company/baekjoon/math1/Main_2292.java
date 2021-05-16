package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 1;

        int i = 0;
        while (true) {
            sum = sum + 6 * i;
            if (sum >= n) {
                System.out.println(i + 1);
                break;
            }
            i++;
        }
    }
}
