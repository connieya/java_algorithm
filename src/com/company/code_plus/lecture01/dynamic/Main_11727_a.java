package com.company.code_plus.lecture01.dynamic;

import java.util.Scanner;

public class Main_11727_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        d[0]=1;
        d[1]=1;
        for (int i=2; i<=n; i++){
            d[i] = d[i-1]+ d[i-2]*2;
            d[i] %= 10007;
        }
        System.out.println(d[n]);
    }
}
