package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class 카드구매하기_11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cardPacks[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cardPacks[i] = sc.nextInt();
        }
        int maxPrice[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (maxPrice[i] < maxPrice[i - j] + cardPacks[j]) {
                    maxPrice[i] = maxPrice[i - j] + cardPacks[j];
                }
            }
        }
        System.out.println(maxPrice[n]);
    }
}
