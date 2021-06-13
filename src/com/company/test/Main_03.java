package com.company.test;

import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price[] = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int[] answer = new int[n];
        for (int i = 0; i < n - 1; i++) {
            answer[i] = -1;
            for (int k = i + 1; k < n; k++) {
                if (price[i] < price[k]) {
                    answer[i] = (k - i);
                    break;
                }
            }

        }
        answer[n-1] = -1;
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
