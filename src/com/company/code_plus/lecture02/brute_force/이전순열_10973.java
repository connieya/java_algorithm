package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class 이전순열_10973 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (!prev_permutation(a)){
            System.out.println(-1);
        }else {
            for (int x : a){
                System.out.print(x+" ");
            }
        }
    }

    static boolean prev_permutation(int a[]) {
        int i = a.length - 1;
        while (i > 0 && a[i - 1] < a[i]) {
            i--;
        }

        if (i <= 0) return false;

        int j = a.length - 1;
        while (a[j] > a[i-1]){
            j--;
        }

        int temp = a[j];
        a[j] = a[i-1];
        a[i -1] = temp;

        j = a.length -1;
        while (i < j) {
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i++;
            j--;
        }
        return true;
    }
}
