package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class 모든순열_10974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        do {
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        } while (next_permutation(a));

    }

    static boolean next_permutation(int a[]) {
        int i = a.length - 1;
        while (i > 0 && a[i - 1] > a[i]) {
            i--;
        }

        if (i <= 0) return false;

        int j = a.length - 1;
        while (a[i - 1] > a[j]) {
            j--;
        }

        swap(a, j, i - 1);


        j = a.length - 1;
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
        return true;

    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
