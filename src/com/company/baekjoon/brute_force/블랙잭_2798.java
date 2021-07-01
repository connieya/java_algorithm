package com.company.baekjoon.brute_force;

import java.util.Scanner;

public class 블랙잭_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        outline:
        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {
                    int sum = array[i]+array[j]+array[k];
                    if (sum == M) {
                        max = sum;
                        break outline;
                    } else if (sum < M) {
                        max = Math.max(max, sum);

                    }

                }
            }

        }
        System.out.println(max);
    }

}
