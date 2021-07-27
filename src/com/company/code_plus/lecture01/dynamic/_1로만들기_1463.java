package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class _1로만들기_1463 {
    private static int[] d;
    private static int temp;
    public static int go(int n){
        if (n==1){
            return 0;
        }
        if (d[n]>0){
            return d[n];
        }
        d[n]= go(n-1)+1;
        if (n%2==0){
             temp = go(n/2)+1;
            if (d[n]>temp){
                d[n] =temp;
            }
        }
        if (n%3==0){
             temp= go(n/3)+1;
            if (d[n]>temp){
                d[n] =temp;
            }
        }
        return d[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        d = new int[N+1];
        System.out.println(go(N));
    }

}
