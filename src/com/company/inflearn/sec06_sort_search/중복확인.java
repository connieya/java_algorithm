package com.company.inflearn.sec06_sort_search;

import java.util.Scanner;

public class 중복확인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        String answer = "U";
        outer:for (int i=1; i<N; i++){
            int temp = arr[i];
            for (int j=i-1; j>0; j--){
                if (arr[j]==temp){
                    answer ="D";
                    break outer;
                }
            }

        }
        System.out.println(answer);
    }
}

