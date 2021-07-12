package com.company.baekjoon.greedy;
import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr [] =  new int[N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int [] array = new int[N];
        int sum =0;
        int answer = 0;
        for (int j=0; j<N; j++){
            sum = sum+arr[j];
            array[j] = sum;
            answer += array[j];
        }

        System.out.println(answer);
    }
}
