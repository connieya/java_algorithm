package com.company.inflearn.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n-1];
        int answer =0;
        while (lt<=rt){
            int mid = (lt+rt)/2;
            if (count(arr,mid) >=m){
                answer = mid;
                lt = mid+1;
            }else {
                rt = mid-1;
            }
        }

        System.out.println(answer);


    }
    public static int count(int arr[] ,int dist){
        int cnt =1;
        int ep = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]-ep >= dist){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }
}
