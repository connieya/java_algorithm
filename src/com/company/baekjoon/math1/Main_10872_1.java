package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_10872_1 {
    public static int recursive(int n){
        if (n==0) return 1;

        return n*recursive(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recursive(n));



    }
}
