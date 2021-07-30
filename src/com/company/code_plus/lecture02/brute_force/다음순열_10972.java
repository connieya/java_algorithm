package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class 다음순열_10972 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (!next_permutation(arr)) {
            System.out.println(-1);
        } else {
            for (int c : arr) {
                System.out.print(c + " ");
            }
        }
    }

    static boolean next_permutation(int[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i -= 1;
        }

        if (i <= 0) {
            return false;
        }

        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) {
            j -= 1;
        }

        int temp = arr[i - 1];
        arr[i-1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 1;
            j -= 1;
        }

        return true;

    }
}
