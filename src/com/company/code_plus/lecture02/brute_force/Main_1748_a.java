package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class Main_1748_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int start =1 , len=1; start <=n; start*=10, len++){
            int end = start*10-1;
            if (end > n){
                end = n;
            }
            ans += (long)(end-start+1)*len;
        }
        System.out.println(ans);

    }
}
