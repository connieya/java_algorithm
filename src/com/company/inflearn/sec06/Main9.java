package com.company.inflearn.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        Main9 M = new Main9();
        int answer = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (M.count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(answer);


    }

    public int count(int[] arr, int capacity) {

        int cnt = 1 , sum =0;
        for (int x: arr){
            if (sum +x > capacity){
                cnt++;
                sum = x;
            }else {
                sum +=x;
            }
        }

        return cnt;

    }
}
