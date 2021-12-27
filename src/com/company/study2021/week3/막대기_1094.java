package com.company.study2021.week3;

import java.util.Scanner;

public class 막대기_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int stick = 64;
        int count =0;
        while (X > 0) {
            if (stick > X) {
                stick /= 2;
            } else {
                count++;
                X  =  X - stick;
            }
        }
        System.out.println(count);
    }
}
