package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class Main_1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int d[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        d[0] = arr[0];
        for (int i=0; i<n-1; i++){

            if (arr[i+1] > arr[i]+arr[i+1]){
                d[i+1] = arr[i+1];
            }else{
                d[i+1] = arr[i]+arr[i+1];
                arr[i+1] = d[i+1];
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int j=0; j<n; j++){
            if (ans < d[j]){
                ans = d[j];
            }
        }
        System.out.println(ans);

    }
}
