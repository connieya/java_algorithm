package com.company.study2021.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] split = br.readLine().split(" ");
        int i= 0;
        for (String str : split) {
            arr[i++] = Integer.parseInt(str);
        }

        printAllRecursive(n, arr);
    }

    public static void printAllRecursive(int n , int [] arr) {
        if (n == 1) {
            printArray(arr);
        } else {
            for (int i= 0; i<n-1; i++) {
                printAllRecursive(n-1 ,  arr);
                if (n%2 == 0) {
                    swap(arr ,i , n-1);
                }else {
                    swap(arr, 0 , n-1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    private static void printArray(int[] arr) {
        System.out.println('\n');
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
