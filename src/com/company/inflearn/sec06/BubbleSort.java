package com.company.inflearn.sec06;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
