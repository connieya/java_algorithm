package com.company.study2021.exam;

import java.util.Scanner;

public class 최대공약수_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int answer = 0;
        for (int i=2; i<=Math.min(m,n);  i++) {
            if (m % i ==0 && n % i ==0) {
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
