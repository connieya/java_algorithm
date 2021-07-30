package com.company.code_plus.lecture02.brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class 차이를최대로_10819 {
    static boolean next_permutation(int arr[]) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }

        if (i <= 0) return false;

        int j = arr.length - 1;
        while (arr[i - 1] >= arr[j]) {
            j--;
        }

        int temp = arr[j];
        arr[j] = arr[i - 1];
        arr[i - 1] = temp;

        j = arr.length - 1;
        while (i < j) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = 0;
        do {
            int sum = getSum(arr);
            max = Math.max(max, sum);
        } while (next_permutation(arr));

        System.out.println(max);
    }

    static int getSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
           sum += Math.abs(arr[i]-arr[i+1]);
        }
        return  sum;
    }
}
