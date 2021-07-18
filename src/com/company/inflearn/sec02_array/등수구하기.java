package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int answer[] = new int[N];

        for (int i=0; i<N; i++){
            int count =1;
            for (int j=0; j<N; j++){
                if (arr[i]<arr[j]){
                    count++;
                }
            }
            answer[i] = count;
        }
        for (int x : answer){
            System.out.print(x+" ");
        }
    }
}
