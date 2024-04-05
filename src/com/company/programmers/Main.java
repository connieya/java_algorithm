package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //       0  1  2  3  4  5  6  7  8  9 10  11 12  13
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 9, 10, 10};
        System.out.println(lower_bound(arr, 0, arr.length, 10)); // 0
        System.out.println(lower_bound(arr, 0, arr.length, 11)); // 0
        System.out.println(lower_bound(arr, 0, arr.length, 4)); // 6
        System.out.println(lower_bound(arr, 0, arr.length, 8)); // 11
        System.out.println(upper_bound(arr, 0, arr.length, 8)); // 11
        System.out.println(upper_bound(arr, 0, arr.length, 4)); // 8
        System.out.println(upper_bound(arr, 0, arr.length, 10)); // 14
        System.out.println(upper_bound(arr, 0, arr.length, 11)); // 14
        System.out.println(upper_bound(arr, 0, arr.length, 9)); // 12
    }

    public static int lower_bound(int arr[], int lt, int rt, int target) {
        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] >= target) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }
        return rt;
    }

    public static int upper_bound(int arr[], int lt, int rt, int target) {
        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] > target) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }
        return rt;
    }
}