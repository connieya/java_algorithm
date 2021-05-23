package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class Main_fibo_2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i=2; i<n; i++){

            arr[0] = 0;
            arr[1] = 1;
            arr[i] = arr[i-1] + arr[i-2];

       }
        for (int x : arr){
            System.out.print(x +" ");
        }
    }
}
