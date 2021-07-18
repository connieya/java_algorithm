package com.company.inflearn.sec06_sort;

import java.util.Scanner;

public class 삽입정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        for (int i=1; i<n; i++){
            int index = i;
            for (int j=i-1; j>=0; j--){
                if (arr[index]< arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[index];
                    arr[index] = temp;
                    index =j;
                }
            }
        }
        for (int x : arr){
            System.out.print(x+" ");
        }
    }
}
