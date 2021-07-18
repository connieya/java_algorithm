package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 점수계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = arr[0];
        for (int i=1; i<N; i++){
           if (arr[i] ==0){
           }else {
              arr[i] = arr[i-1]+1;
           }
           sum += arr[i];
        }
        System.out.println(sum);
    }
}
