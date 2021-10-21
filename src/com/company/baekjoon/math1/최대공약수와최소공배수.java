package com.company.baekjoon.math1;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = gcd(a, b);
        System.out.println(gcd);
        System.out.println(gcd * (a / gcd) * (b / gcd));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
