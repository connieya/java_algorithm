package com.company.code_plus.lecture02.brute_force;


import java.util.Scanner;

public class Main_2309 {
    public static void main(String[] args) {
        int arr[] = new int[9];

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<9; i++){
           arr[i] =  sc.nextInt();
        }
       int sum =0;
       for (int j=0; j<9; j++){
           sum += arr[j];
       }
       int value = sum-100;
       for (int i=0; i<9; i++){
           for (int j=i+1; j<9; j++){
               if (arr[i]+arr[j] == value){
                   for (int l=0; l<9; l++){
                       if (l== i || l == j){
                           continue;
                       }
                       System.out.println(arr[l]);
                   }
                   break;
               }
           }
       }


    }
}
