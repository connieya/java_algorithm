package com.company.inflearn.sec04_hash;

import java.util.*;

public class K번째큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        int answer =0;
        int sum =0;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        Loop:for (int a = 0; a < arr.length; a++) {
            for (int b= a+1; b<arr.length; b++) {
                for (int c= b+1; c<arr.length; c++) {
                    set.add(arr[a]+arr[b]+arr[c]);
                }
            }
        }



    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] <= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
