package com.company.inflearn.sec06_sort_search;

import java.util.Scanner;

public class 장난꾸러기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int student[]= new int[N];
        for (int i=0; i<N; i++){
            student[i] = sc.nextInt();
        }
        int arr[] = student.clone();
        sorted(arr,N);
        for (int i=0; i<N; i++){
            if (arr[i] != student[i]){
                System.out.print((i+1)+" ");
            }
        }
    }
    static void sorted(int arr[],int size){
        for (int i=1; i<size; i++){
            int temp = arr[i];
            int j;
            for (j=i-1; j>=0;j--){
                if (arr[j]>temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }

            }
            arr[j+1] =temp;
        }
    }
}
