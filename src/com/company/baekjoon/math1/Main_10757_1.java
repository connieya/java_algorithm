package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_10757_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int max = Math.max(str1.length(), str2.length());
        int a[] = new int[max + 1];
        int b[] = new int[max + 1];
        for (int i = str1.length() - 1, idx = 0; i >= 0; i--, idx++) {
            a[idx] = str1.charAt(i) - '0';
        }
        for (int i = str2.length() - 1, idx = 0; i >= 0; i--, idx++) {
            b[idx] = str2.charAt(i) - '0';
        }

        for (int i = 0; i < max; i++) {
            int value = a[i] + b[i];
            a[i] = value % 10;
            a[i + 1] += (value / 10);
        }

        StringBuilder sb = new StringBuilder();
        if (a[max] != 0) {
            sb.append(a[max]);
        }
        for (int i = max - 1; i >= 0; i--) {
                sb.append(a[i]);

        }
        System.out.println(sb);
    }

}
