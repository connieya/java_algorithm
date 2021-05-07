package com.company.inflearn.sec06;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }



        for (int i=1; i<n; i++){
            int tmp = arr[i];
            int j;
            for (j=i-1; j>=0; j--){
                if (arr[j]>tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;

        }

        for (int x : arr){
            System.out.print(x +" ");
        }


    }


}
