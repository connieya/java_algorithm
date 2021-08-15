package com.company.baekjoon.implement;

import java.util.Scanner;

public class 홀수_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 7;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (count-- > 0) {
            int number = sc.nextInt();
            if (number % 2 == 1) {
                sum += number;
                min = Math.min(min, number);
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {

            System.out.println(sum);
            System.out.println(min);
        }
    }
}
