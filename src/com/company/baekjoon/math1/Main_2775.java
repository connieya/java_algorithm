package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_2775 {
    public static void main(String[] args) {
        int arr[][] = new int[15][15];
        for (int i=1; i<15; i++){
            arr[0][i] = i;
        }
        for (int i=1; i<15; i++){
            for (int j=1; j<15; j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(arr[k][n]);
        }
    }
}
