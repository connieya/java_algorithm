package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class 외판원순회2_10971 {
    static int min = Integer.MAX_VALUE;
    static int arr[][];
    static int d[];
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = i;
        }

        do {
            if (d[0] != 0) break;
           getMinCircuitCost();

        } while (next_permutation(d));

        System.out.println(min);
    }

    static boolean next_permutation(int d[]) {
        int i = d.length - 1;
        while (i > 0 && d[i - 1] > d[i]) {
            i--;
        }
        if (i <= 0) return false;

        int j = d.length - 1;
        while (d[i - 1] > d[j]) {
            j--;
        }
        swap(d, i - 1, j);

        j = d.length - 1;
        while (i < j) {
            swap(d, i, j);
            i++;
            j--;
        }
        return true;

    }

    static void swap(int d[], int a, int b) {
        int temp = d[a];
        d[a] = d[b];
        d[b] = temp;
    }

    static void getMinCircuitCost(){
        int sum = 0;
        boolean ok = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[d[i]][d[i + 1]] == 0) {
                ok = false;
            } else {
                sum += arr[d[i]][d[i + 1]];
            }
        }
        checkMin(ok , sum);

    }
    static void checkMin(boolean ok, int sum) {
        if (ok && arr[d[n - 1]][d[0]] != 0) {
            sum += arr[d[n-1]][d[0]];
            if (min > sum){
                min = sum;
            }
        }
    }
}
