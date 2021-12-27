package com.company.study2021.week3;

import java.util.Scanner;

public class 타일01_1904 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[1000_001];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] =3;
        for (int i=4; i<= 1000_000; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 15746;
        }
        System.out.println(arr[n]);
    }
}
