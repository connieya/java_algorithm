package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum =0;
        int i = 0;
        while (n > sum){
            i++;
            sum += i;
        }
        // 14->  i가 만약 5번줄이다. 합은 6 -> 5/1 4/2 3/3
        // i가 짝수이면 1 / 짝수 로 시작 , 홀수이면 홀수 / 1 로 시작
    }
}
