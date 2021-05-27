package com.company.baekjoon.func;

import java.util.Scanner;

public class Main_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<100){
            System.out.println(n);
        }else {
            int count = 99;
            for (int i=100; i<=n; i++){
                int hun = i/100;
                int ten = (i/10)%10;
                int one = i%10;
                if ((hun -ten) == (ten-one)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
