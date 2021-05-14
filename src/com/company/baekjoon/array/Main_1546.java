package com.company.baekjoon.array;

import java.util.Scanner;

public class Main_1546 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        double max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        double sum=0;
        for (int i=0; i<n; i++){
            sum += (arr[i]/max)*100;
        }
        System.out.println(sum/n);
    }
}
