package com.company.baekjoon.implement;

import java.util.Scanner;

public class 약수_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (count-- > 0) {
            int value = sc.nextInt();
            max = value > max ? value : max;
            min = value < min ? value : min;
        }
        System.out.println(max * min);
    }
}
