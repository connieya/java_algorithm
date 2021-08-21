package com.company.baekjoon.greedy;
import java.util.Scanner;

public class 주유소_13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long dis[] = new long[n - 1];
        long price[] = new long[n];
        for (int i = 0; i < n - 1; i++) {
            dis[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextLong();
        }
        long sum = 0;
        long min_price = price[0];
        for (int i = 0; i < n-1; i++) {
            if (min_price > price[i]) {
                min_price = price[i];
            }

            sum += min_price * dis[i];
        }
        System.out.println(sum);

    }
}
