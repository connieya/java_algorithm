package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int i = 0;
        for (int j = 2; j <= n; j++) {
            for ( i = 2; i < j; i++) {
                if (j % i == 0) {
                    break;
                }
            }
            if (i == j) count++;

        }
        System.out.println(count);
    }


}
