package com.company.inflearn.sec07;

import java.util.Scanner;

public class 피보나치for문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long fibo[] = new long[i];
        fibo[0] =1;
        fibo[1] =1;
        for (int j=2; j<i; j++){
            fibo[j] = fibo[j-1]+fibo[j-2];
        }

        for (long c : fibo){
            System.out.print(c+" ");
        }

    }
}
