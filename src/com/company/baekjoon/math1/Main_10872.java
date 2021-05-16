package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 1;
        for (int i=1; i<=n; i++){

            answer = answer*i;
        }
        System.out.println(answer);
    }
}
