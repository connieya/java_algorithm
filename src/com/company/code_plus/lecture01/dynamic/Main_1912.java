package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class Main_1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int d[] = new int[n];

        for (int j=0; j<n; j++){
            if (j==0) continue;
            d[j] = arr[j];
            arr[j+1] = arr[j+1] +d[j];
            if(arr[j+1] > d[j+1]){

            }
        }
    }
}
