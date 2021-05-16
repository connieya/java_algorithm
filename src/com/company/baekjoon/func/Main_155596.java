package com.company.baekjoon.func;

import java.util.Scanner;

public class Main_155596 {
    public static long sum(int[]a){
        int sum = 0;
        for (int i=0; i<a.length; i++){
            sum+= a[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sum(arr));

    }
}
