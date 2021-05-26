package com.company.baekjoon.charcters;

import java.util.Scanner;

public class Main_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []d = new int[n+1];
        if (n<=2){
            d[n] = n;
        }
        d[3] = 4;
        for (int i=4; i<=n; i++){
            d[i] = d[i-1] + d[i-2] +d[i-3];
        }
        System.out.println(d[n]);

    }
}
