package com.company.inflearn.sec06_sort_search;

import java.util.Scanner;

public class 삽입정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int temp = i;
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[temp]){
                    arr[j + 1] = arr[j];
                }
                else {
                    break;
                }
            }
            arr[j + 1] = arr[temp];
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
