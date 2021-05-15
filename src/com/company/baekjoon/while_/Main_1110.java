package com.company.baekjoon.while_;

import java.util.Scanner;

public class Main_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int f = n;
        while (true) {
            int a = f/ 10;
            int b = f % 10;
            int c = a + b;
             f = (b * 10) + (c%10);
             count++;
             if (n==f){
                 System.out.println(count);
                 break;
             }
        }

    }
}
