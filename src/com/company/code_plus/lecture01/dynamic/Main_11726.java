package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class Main_11726 {
    static int memo[];

    public static int tile(int n) {
        if (n <= 2) return n;
        else {
            if (memo[n] > 0) {
                return memo[n];
            } else {

                memo[n] = tile(n - 1) + tile(n - 2);
                return memo[n];
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n+1];
        System.out.println(tile(n)%10007);


    }

}
