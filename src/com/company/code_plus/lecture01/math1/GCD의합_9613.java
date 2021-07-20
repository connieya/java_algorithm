package com.company.code_plus.lecture01.math1;

import java.util.Scanner;

public class GCD의합_9613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- >0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            System.out.println(sum(arr));

        }
    }
    static long sum(int[]arr){
        long sum = 0;
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                sum += gcd(arr[i],arr[j]);
            }
        }
        return sum;
    }
    static int gcd(int a, int b){
        if (b==0) return a;
        return gcd(b, a%b);
    }
}
