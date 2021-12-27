package com.company.study2021.exam;

import java.util.Scanner;

public class 수들의합5_2018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count =0;
        int sum =0;
        int i = 0;
        int j = 0;
        while (i <= N){
            if (sum < N) {
                sum += ++i;
            }else {
                if (sum == N) {
                    count++;
                }
                sum -= ++j;
            }
        }
        System.out.println(count);
    }
}
