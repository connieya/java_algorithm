package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class Main_fibo {
    static int memo[] = new int[100];
    public static int fibonacci(int n){
        if (n<=1){
            return n;
        }else {
            if (memo[n] >0){
                return memo[n];
            }
            memo[n] =  fibonacci(n-1) +fibonacci(n-2);
            return memo[n];

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       for (int i=0; i<n; i++){
           System.out.print(fibonacci(i) +" ");
       }
    }
}
