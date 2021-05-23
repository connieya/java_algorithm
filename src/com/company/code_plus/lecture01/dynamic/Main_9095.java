package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class Main_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {

            int n = sc.nextInt();
            int arr[] = new int[12];
            arr[1] = 1;
            arr[2] =2;
            arr[3] = 4;
            for (int j=4; j<=n; j++){
                arr[j] = arr[j-1] +arr[j-2] + arr[j-3];
            }
            System.out.println(arr[n]);
        }
    }
}
