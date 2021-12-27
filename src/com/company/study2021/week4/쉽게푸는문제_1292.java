package com.company.study2021.week4;

import java.util.Scanner;

public class 쉽게푸는문제_1292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int index = 1;
        int[] arr = new int[1001];
        for (int i = 1; i <= 500; i++) {
            for (int j = 0; j < i; j++) {
                if (index == 1000) break;
                arr[index] = i;
                index++;
            }
        }
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
