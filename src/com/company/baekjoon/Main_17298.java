package com.company.baekjoon;

import java.util.Scanner;

public class Main_17298 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        for (int j=0; j<n; j++){
            for (int k=j; k<n; k++){
                if (arr[j] < arr[k]){
                    arr[j] = arr[k];
                    break;
                }
                arr[j] = -1;
            }
        }

        for (int c : arr){
            System.out.print(c+" ");
        }

    }


}
