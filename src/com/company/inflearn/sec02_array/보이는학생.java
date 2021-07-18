package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 보이는학생 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i=0; i<N; i++){
            arr[i] =sc.nextInt();
        }
        int MAX  = Integer.MIN_VALUE;
        int count =0;
        for (int i=0; i<N; i++){
            if (arr[i] > MAX){
                count++;
                MAX = arr[i];
            }
        }
        System.out.println(count);
    }
}
