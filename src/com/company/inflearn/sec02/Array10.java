package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array10 {

    public int solution(int num , int arr[][]){
        int count = 0;
        int number = num+2;

        int newArray[][] = new int[number][number];
        for (int i=1; i< number-1; i++){
            for (int j=1; j<number-1; j++){
                newArray[i][j] = arr[i-1][j-1];
            }
        }
        // 가장자리가 0인 새로운 배열 생성

        for (int i=1; i< number-1; i++){
            for (int j=1; j<number-1; j++){
                if (newArray[i][j]> newArray[i-1][j] && newArray[i][j]>newArray[i+1][j] &&
                newArray[i][j]> newArray[i][j+1] && newArray[i][j]>newArray[i][j-1]){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[][] = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                array[i][j] =sc.nextInt();
            }
        }

        Array10 A =new Array10();
        System.out.println(A.solution(n,array));

    }
}
