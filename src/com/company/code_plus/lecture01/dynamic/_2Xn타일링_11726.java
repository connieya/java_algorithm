package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class _2Xn타일링_11726 {
    static int[] memo;
    static int dp(int n){
        if (n<=2) return n;
        if (memo[n]>0) return memo[n];
        return memo[n] =dp(n-1)+dp(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n+1];
        System.out.println(dp(n)%10007);

    }
}
