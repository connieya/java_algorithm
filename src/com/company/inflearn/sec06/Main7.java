package com.company.inflearn.sec06;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];

        for (int j = 0; j < n - 1; j++) {
            for (int k = 0; k < n - 1 - j; j++) {

                if (arr[k][j] >= arr[k + 1][j]) {
                    if (arr[k][++j] == arr[k + 1][++j] && arr[k][j] > arr[k + 1][j]) {

                        int[] tmp = arr[k + 1];
                        arr[k + 1] = arr[k];
                        arr[k] = tmp;
                        j =0;
                    }
                }
            }
            break;
        }


    }
}
