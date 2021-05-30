package com.company.baekjoon.avatar;

import java.util.Scanner;

public class Main_2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j =0; j<i; j++){
                System.out.print(" ");
            }

            for (int k=0; k<n-1-i; k++){
                System.out.print("*");
            }
            System.out.print("*");
            for (int k=0; k<n-1-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
