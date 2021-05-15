package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean arr[] = new boolean[n + 1];

        int count =0;
        for (int i=2; i<=n; i++){
            if (arr[i] == false) count++;

            for (int j=i+i; j<=n; j+=i){
                arr[j] = true;
            }
        }
        System.out.println(count);
    }
}
