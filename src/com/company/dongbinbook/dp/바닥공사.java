package com.company.dongbinbook.dp;

import java.util.Scanner;

public class 바닥공사 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n+1];
        arr[1] = 1;
        arr[2] = 3;
        for (int i=3; i<=n; i++){
            arr[i] = (arr[i-1] + 2*arr[i-2]) % 796_796;
        }
        System.out.println(arr[n]);
    }
}
