package com.company.baekjoon.math2;

import java.util.Scanner;

public class Main_2581 {
    public static void main(String[] args) {
        boolean arr[] = new boolean[10001];
        arr[0] = true;
        arr[1] = true;
        for (int i=2; i*i<arr.length; i++){
            if (arr[i] == true){
                continue;
            }

            for (int j=i+i; j <10001; j+=i){
                arr[j] = true;
            }
        }
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0 ;
        int min = Integer.MAX_VALUE;
        for (int i=m; i<=n; i++){
            if (arr[i]==false){
                sum +=i;
                if (min > i){
                     min = i;
                }
            }
        }
        if (sum==0){
            System.out.println(-1);
        }else {
            System.out.println(sum+"\n"+min);
        }

    }

}
